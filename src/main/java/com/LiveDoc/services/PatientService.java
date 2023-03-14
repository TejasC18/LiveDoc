package com.LiveDoc.services;

import java.util.List;

import com.LiveDoc.dto.PatientsDTO;

public interface PatientService {
public String addPatient(PatientsDTO objPatient);
public String removePatientById(int patientId);
public PatientsDTO getPatientById(int patientId);
public List<PatientsDTO> getAllPatients();
public boolean patientLogin(int patientId,String password);
}
