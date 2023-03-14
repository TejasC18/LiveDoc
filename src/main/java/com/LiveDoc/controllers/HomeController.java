package com.LiveDoc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.LiveDoc.dto.DoctorsDTO;
import com.LiveDoc.dto.PatientsDTO;
import com.LiveDoc.pojo.Doctors;
import com.LiveDoc.pojo.Patients;
import com.LiveDoc.services.AdminService;
import com.LiveDoc.services.DoctorService;
import com.LiveDoc.services.PatientService;

@Controller
@RequestMapping("/")
public class HomeController
{
	@Autowired
    DoctorService doctorService;
    @Autowired
    PatientService patientService;
    @Autowired
    AdminService adminService;
    
    @GetMapping("/")
    public String index(){
        return "index.html";
    }
    
    @GetMapping("/login")
    public String login(Model data) {
    	data.addAttribute("objUser",new Patients());
    	return "login.jsp";
    }
    
    @PostMapping("/authenticate")
    public String authenticate(Model data,@RequestParam ("userId") int userId , @RequestParam("password") String password) {
    	
    	if(doctorService.doctorLogin(userId,password)) 
    	{
    		data.addAttribute("userId",userId);
    		return "doctorHomepage.jsp";
    	}
    	else if(patientService.patientLogin(userId,password))
    	{
    		data.addAttribute("userId",userId);
    		return "patientHomepage.jsp";
    	}
    	else if(adminService.adminLogin(userId,password))
    	{
    		data.addAttribute("userId",userId);
    		return "adminHomepage.jsp";
    	}
    	else
    	{
    		return "registerBuffer.jsp";
    	}
    }
    
    @GetMapping("/register")
    public String register() {
    	return "registerBuffer.jsp";
    }
    
    @GetMapping("/registerPatient")
    public String registerPatient() {
    	return "registerPatient.jsp";
    }
    
    @PostMapping("/savePatient")
    public String savePatient(@RequestParam("first_name") String firstName,@RequestParam("last_name") String lastName,@RequestParam("gender") String gender,@RequestParam("contactNumber") String contactNumber,@RequestParam("age") int age,@RequestParam("emailId") String emailId,@RequestParam("bloodGroup") String bloodGroup,@RequestParam("address") String address,@RequestParam("aadharCardNumber") long aadharCardNumber,@RequestParam("password") String password) {
    	try {
    		PatientsDTO objPatient = new PatientsDTO();
    		objPatient.setFirst_name(firstName);
    		objPatient.setLast_name(lastName);
    		objPatient.setGender(gender);
    		objPatient.setContactNumber(contactNumber);
    		objPatient.setAge(age);
    		objPatient.setEmailId(emailId);
    		objPatient.setBloodGroup(bloodGroup);
    		objPatient.setAddress(address);
    		objPatient.setAadharCardNumber(aadharCardNumber);
    		objPatient.setPassword(password);
        	patientService.addPatient(objPatient);
        	return "login.jsp";
    	}
    	catch(Exception e) {
    		return "index.html";
    	}
    }
    
    @GetMapping("/registerDoctor")
    public String registerDoctor() {
    	return "registerDoctor.jsp";
    }
    @PostMapping("/saveDoctor")
    public String saveDoctor(@RequestParam("first_name") String firstName,@RequestParam("last_name") String lastName,@RequestParam("gender") String gender,@RequestParam("contactNumber") String contactNumber,@RequestParam("age") int age,@RequestParam("entryCharge") int entryCharge,@RequestParam("qualification") String qualification,@RequestParam("doctorType") String doctorType,@RequestParam("aadharCardNumber") long aadharCardNumber,@RequestParam("password") String password) {
    	try {
    		DoctorsDTO objDoctor = new DoctorsDTO();
    		objDoctor.setFirstName(firstName);
    		objDoctor.setLastName(lastName);
    		objDoctor.setGender(gender);
    		objDoctor.setContactNumber(contactNumber);
    		objDoctor.setEntryCharge(entryCharge);
    		objDoctor.setQualification(qualification);
    		objDoctor.setDoctorType(doctorType);
    		objDoctor.setAadharCardNumber(aadharCardNumber);
    		objDoctor.setPassword(password);
    		doctorService.addDoctor(objDoctor);
        	return "doctorHomepage.jsp";
    	}
    	catch(Exception e) {
    		return "login.jsp";
    	}
    }
    
    @GetMapping("/showAllDoctors")
    public String showAllDoctors(Model data) {
    	List<DoctorsDTO> list = doctorService.getAllDoctors();
    	data.addAttribute("doctorList", list);
    	return "allDoctors.jsp";
    }
    
    @GetMapping("/filter")
    public String showFilteredDoctors(Model data,@RequestParam("search") String search) {
    	List<Doctors> list = doctorService.getFilteredDoctors(search);
    	data.addAttribute("doctorList", list);
    	return "filteredDoctors.jsp";
    }
}
