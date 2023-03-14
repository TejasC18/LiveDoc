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

import com.LiveDoc.dto.DoctorsDTO;
import com.LiveDoc.dto.QueriesDTO;
import com.LiveDoc.dto.ReportsDTO;
import com.LiveDoc.pojo.Appointment;
import com.LiveDoc.services.AppointmentService;
import com.LiveDoc.services.DoctorService;
import com.LiveDoc.services.QueriesService;
import com.LiveDoc.services.ReportService;

@Controller
@RequestMapping("/doctor")
public class DoctorController
{
	@Autowired
	AppointmentService appointmentService;
	
	@Autowired
	DoctorService doctorService;
	
	@Autowired
	QueriesService queriesService;
	
	@Autowired
	ReportService reportService;
	
	@GetMapping("/{userId}")
    public String homepage(Model data,@PathVariable("userId")int userId){
		data.addAttribute("userId",userId);
        return "doctorHomepage.jsp";
    }
	
	@GetMapping("/contact/{userId}")
	public String contactUs(Model data,@PathVariable("userId")int userId) {
		data.addAttribute("userId",userId);
		return "contactUsForm.jsp";
	}
	
	@PostMapping("/query")
	public String registerQuery(Model data,@RequestParam("doctorId") int doctorId,@RequestParam("query") String query)
	{
		data.addAttribute("userId",doctorId);
		QueriesDTO objQuery = new QueriesDTO();
		objQuery.setDoctorId(doctorId);
		objQuery.setQuery(query);
		objQuery.setStatus("pending");
		queriesService.addQuery(objQuery);
		return "doctorHomepage.jsp";
	}
	
	@GetMapping("/appointments/{userId}")
	public String appointments(Model data,@PathVariable("userId")int userId) {
		data.addAttribute("userId",userId);
		List<Appointment> list = appointmentService.getAppointments(userId);
		data.addAttribute("appointments", list);
		return "scheduledAppointments.jsp";
	}
	
	@GetMapping("/profile/{userId}")
	public ModelAndView showProfile(Model data,@PathVariable("userId")int userId) {
		data.addAttribute("userId",userId);
		DoctorsDTO objDoctor = doctorService.searchDoctorById(userId);
		return new ModelAndView("showDoctorProfile.jsp","showProfile",objDoctor);
	}
	
	@GetMapping("/generateReport/{appointmentId}/{userId}")
	public String generateReport(Model data,@PathVariable("appointmentId")int appointmentId,@PathVariable("userId")int userId)
	{
		appointmentService.updateAppointments(appointmentId);
		data.addAttribute("userId",userId);
		data.addAttribute("appointmentId",appointmentId);
		return "reportForm.jsp";
	}
	
	@PostMapping("/addReport")
	public String addReport(Model data,@RequestParam("appointmentId") int appointmentId,@RequestParam("patientId") int patientId,@RequestParam("doctorId") int doctorId,@RequestParam("medicinePrescribed") String medicinePrescribed,@RequestParam("comment") String comment)
	{
		try
		{
			ReportsDTO objReport = new ReportsDTO();
			objReport.setAppointmentId(appointmentId);
			objReport.setPatientId(patientId);
			objReport.setDoctorId(doctorId);
			objReport.setMedicinePrescribed(medicinePrescribed);
			objReport.setDoctorComment(comment);
			reportService.addReport(objReport);
			appointmentService.updateAppointments(appointmentId);
			data.addAttribute("userId",doctorId);
			return "doctorHomepage.jsp";
		} catch (Exception e)
		{
			return "doctorHomepage.jsp";
		}
	}
}
