package com.LiveDoc.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.LiveDoc.dto.DoctorsDTO;
import com.LiveDoc.pojo.Doctors;
import com.LiveDoc.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService{
    @Autowired
    DoctorRepository repositoryDoctor;
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public String addDoctor(@RequestBody DoctorsDTO objDoctor) {
        Doctors doctorEntity = new Doctors();
        BeanUtils.copyProperties(objDoctor,doctorEntity);
        repositoryDoctor.save(doctorEntity);
        return "Success";
    }

    @Override
    public String removeDoctor(@PathVariable("doctorId") int doctorId) {
        repositoryDoctor.deleteById(doctorId);
        return "Deleted";
    }

    @Override
    public DoctorsDTO searchDoctorById(int doctorId) {
        Optional<Doctors> optDoctor = repositoryDoctor.findById(doctorId);
        if (optDoctor.isPresent())
        {
            Doctors doctorEntity = optDoctor.get();
            DoctorsDTO dtoDoctor = new DoctorsDTO();
            BeanUtils.copyProperties(doctorEntity,dtoDoctor);
            return dtoDoctor;
        }
        return null;
    }

    @Override
    public List<DoctorsDTO> getAllDoctors() {
        Iterator<Doctors> iter = repositoryDoctor.findAll().iterator();
        ArrayList<DoctorsDTO> list = new ArrayList<>();
        while(iter.hasNext())
        {
            Doctors doctorEntity = iter.next();
            DoctorsDTO dtoDoctor = new DoctorsDTO();
            BeanUtils.copyProperties(doctorEntity,dtoDoctor);
            list.add(dtoDoctor);
        }
        return list;
    }

    @Override
    public boolean doctorLogin(int doctorId, String password) {
        Optional<Doctors> optionalDoctors= repositoryDoctor.findById(doctorId);
        if (optionalDoctors.isPresent())
        {
            Doctors objDoctor = optionalDoctors.get();
            if (objDoctor.getPassword().equals(password))
            {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public List<Doctors> getFilteredDoctors(String speciality)
    {
    	try(Session session = sessionFactory.openSession())
		{
			Query query = session.getNamedQuery("filteredDoctors");
			query.setParameter(1,speciality);
			List<Doctors> list = query.getResultList();
			return list;
		}catch (Exception e) {
			return null;
		}
    }
}
