package com.LiveDoc.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.LiveDoc.dto.DoctorsDTO;
import com.LiveDoc.pojo.Doctors;

public interface DoctorService {
    public String addDoctor(@RequestBody DoctorsDTO objDoctor);
    public String removeDoctor(@PathVariable("doctorId") int doctorId);
    public DoctorsDTO searchDoctorById(@PathVariable("doctorId") int doctorId);
    public List<DoctorsDTO> getAllDoctors();
    public boolean doctorLogin(@PathVariable("doctorId") int doctorId,@PathVariable("password") String password);
    public List<Doctors> getFilteredDoctors(String speciality);
}
