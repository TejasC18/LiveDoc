package com.LiveDoc.services;

import java.util.List;

import com.LiveDoc.dto.AppointmentDTO;
import com.LiveDoc.pojo.Appointment;

public interface AppointmentService
{
	public List<Appointment> getAppointments(int doctorId);
	public boolean addAppointment(AppointmentDTO objAppointment);
	public boolean removeAppointment(int appointmentId);
	public void updateAppointments(int appointmentId);
}
