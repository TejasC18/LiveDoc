package com.LiveDoc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.LiveDoc.dto.DoctorsDTO;
import com.LiveDoc.pojo.Doctors;
import com.LiveDoc.services.AdminService;
import com.LiveDoc.services.DoctorService;

@Controller
@RequestMapping("/admin")
public class AdminController
{
	@Autowired
	AdminService adminService;
	
	@Autowired
	DoctorService doctorService;
	
	@GetMapping("/{userId}")
	public String homepage(Model data,@PathVariable("userId")int userId) {
		data.addAttribute("userId",userId);
    	return "adminHomepage.jsp";
	}
	
	@GetMapping("/addDoctor/{userId}")
	public String addDoctor(Model data,@PathVariable("userId")int userId) {
		data.addAttribute("userId",userId);
		return "addDoctor2.jsp";
	}
	
	@PostMapping("/registerDoctor/{userId}")
    public String saveDoctor(Model data,@PathVariable("userId")int userId,@RequestParam("first_name") String firstName,@RequestParam("last_name") String lastName,@RequestParam("gender") String gender,@RequestParam("contactNumber") String contactNumber,@RequestParam("age") int age,@RequestParam("entryCharge") int entryCharge,@RequestParam("qualification") String qualification,@RequestParam("doctorType") String doctorType,@RequestParam("aadharCardNumber") long aadharCardNumber,@RequestParam("password") String password) {
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
    		data.addAttribute("userId",userId);
        	return "adminHomepage.jsp";
    	}
    	catch(Exception e) {
    		data.addAttribute("userId",userId);
    		return "addDoctor2.jsp";
    	}
    }
	
	@GetMapping("/removeDoctor/{userId}")
	public String removeDoctor(Model data,@PathVariable("userId")int userId) {
		data.addAttribute("userId",userId);
		return "removeDoctor.jsp";
	}
	
	@PostMapping("/removeDoctor/{userId}")
	public String removeDoctor(Model data,@PathVariable("userId")int userId,@RequestParam("doctorID") int doctorID) {
		doctorService.removeDoctor(doctorID);
		data.addAttribute("userId",userId);
		return "adminHomepage.jsp";
	}
	
	@GetMapping("/showAllDoctors/{userId}")
    public String showAllDoctors(Model data,@PathVariable("userId")int userId) {
    	List<DoctorsDTO> list = doctorService.getAllDoctors();
    	data.addAttribute("doctorList", list);
    	data.addAttribute("userId",userId);
    	return "allDoctorsAdmin.jsp";
    }
	
	@GetMapping("/filter/{userId}")
    public String showFilteredDoctors(Model data,@PathVariable("userId")int userId,@RequestParam("search") String search) {
    	List<Doctors> list = doctorService.getFilteredDoctors(search);
    	data.addAttribute("doctorList", list);
    	data.addAttribute("userId",userId);
    	return "filteredDoctorsAdmin.jsp";
    }
}
