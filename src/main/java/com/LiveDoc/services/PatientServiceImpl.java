package com.LiveDoc.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LiveDoc.dto.PatientsDTO;
import com.LiveDoc.pojo.Patients;
import com.LiveDoc.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService{
    @Autowired
    PatientRepository repositoryPatient;

    @Override
    public String addPatient(PatientsDTO objPatient) {
        Patients patientEntity = new Patients();
        BeanUtils.copyProperties(objPatient,patientEntity);
        repositoryPatient.save(patientEntity);
        return "Success";
    }

    @Override
    public String removePatientById(int patientId) {
        repositoryPatient.deleteById(patientId);
        return "Deleted";
    }

    @Override
    public PatientsDTO getPatientById(int patientId) {
        Optional<Patients> optPatients = repositoryPatient.findById(patientId);
        if(optPatients.isPresent())
        {
        	Patients entityPatients = optPatients.get();
            PatientsDTO dtoPatient = new PatientsDTO();
            BeanUtils.copyProperties(entityPatients,dtoPatient);
            return dtoPatient;
        }
        return null;
    }

    @Override
    public List<PatientsDTO> getAllPatients() {
        Iterator<Patients> iter = repositoryPatient.findAll().iterator();
        ArrayList<PatientsDTO> list = new ArrayList<>();
        while(iter.hasNext())
        {
            Patients patientsEntity = iter.next();
            PatientsDTO dtoPatient = new PatientsDTO();
            BeanUtils.copyProperties(patientsEntity,dtoPatient);
            list.add(dtoPatient);
        }
        return list;
    }

    @Override
    public boolean patientLogin(int patientId, String password) {
        Optional<Patients> optionalPatient= repositoryPatient.findById(patientId);
        if (optionalPatient.isPresent())
        {
            Patients objPatient = optionalPatient.get();
            if (objPatient.getPassword().equals(password))
            {
                return true;
            }
        }
        return false;
    }
}
