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
import org.springframework.web.servlet.ModelAndView;

import com.LiveDoc.dto.AppointmentDTO;
import com.LiveDoc.dto.DoctorsDTO;
import com.LiveDoc.dto.PatientsDTO;
import com.LiveDoc.pojo.Doctors;
import com.LiveDoc.pojo.Reports;
import com.LiveDoc.services.AppointmentService;
import com.LiveDoc.services.DoctorService;
import com.LiveDoc.services.PatientService;
import com.LiveDoc.services.ReportService;

@Controller
@RequestMapping("/patients")
public class PatientController
{
	@Autowired
	PatientService patientsService;
	@Autowired
    DoctorService doctorService;
	@Autowired
	AppointmentService appointmentService;
	@Autowired
	ReportService reportService;
	
	@GetMapping("/{userId}")
    public String homepage(Model data,@PathVariable("userId")int userId){
		data.addAttribute("userId",userId);
        return "patientHomepage.jsp";
    }
	
	@GetMapping("showAllDoctors/{userId}")
	public String showAllDoctors(Model data,@PathVariable("userId")int userId)
	{
		List<DoctorsDTO> list = doctorService.getAllDoctors();
    	data.addAttribute("doctorList", list);
		data.addAttribute("userId",userId);
		return "allDoctorsPatients.jsp";
	}
	
	@GetMapping("/filter/{userId}")
    public String showFilteredDoctors(Model data,@PathVariable("userId")int userId,@RequestParam("search") String search) {
    	List<Doctors> list = doctorService.getFilteredDoctors(search);
    	data.addAttribute("doctorList", list);
    	data.addAttribute("userId",userId);
    	return "filteredDoctorsPatient.jsp";
    }
	
	@GetMapping("/profile/{userId}")
	public ModelAndView profile(Model data,@PathVariable("userId")int userId) {
		PatientsDTO objUser = patientsService.getPatientById(userId);
		data.addAttribute("userId",userId);
		return new ModelAndView("patientProfile.jsp","showProfile",objUser);	
	}
	
	@GetMapping("/appointment/{userId}")
	public String appointment(Model data,@PathVariable("userId")int userId) {
		data.addAttribute("userId",userId);
		return "appointmentForm.jsp";
	}
	@PostMapping("/bookedAppointment")
	public String appointment(Model data,@RequestParam("problem")String problem,@RequestParam("userId")int userId,@RequestParam("doctorName")String doctorName,@RequestParam("doctorId")int doctorId,@RequestParam("doctorType")String doctorType,@RequestParam("date")String date,@RequestParam("time")String time)
	{
		try
		{
			DoctorsDTO objDoctor = doctorService.searchDoctorById(doctorId);
			AppointmentDTO objAppointment = new AppointmentDTO();
			objAppointment.setProblem(problem);
			objAppointment.setPatientId(userId);
			objAppointment.setDoctorName(objDoctor.getFirstName());
			objAppointment.setDoctorId(doctorId);
			objAppointment.setDoctorType(objDoctor.getDoctorType());
			objAppointment.setQualification(objDoctor.getDoctorType());
			objAppointment.setDoctorFees(objDoctor.getEntryCharge());
			objAppointment.setPaymentStatus("pending");
			objAppointment.setAppointmentStatus("pending");
			objAppointment.setDate(date);
			objAppointment.setTime(time);
			appointmentService.addAppointment(objAppointment);
			data.addAttribute("userId", userId);
			return "patientHomepage.jsp";
		} catch (Exception e)
		{
			return "appointmentForm.jsp";
		}
	}
	
	@GetMapping("/showAllReports/{userId}")
	public String reports(Model data,@PathVariable("userId")int userId)
	{
		List<Reports> list = reportService.getReportbyPatientId(userId);
		data.addAttribute("userId",userId);
		data.addAttribute("reportList", list);
		return "showReports.jsp";
	}
}
