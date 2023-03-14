package com.LiveDoc.dto;

public class ReportsDTO
{
	int reportId;
	int appointmentId;
	int patientId;
	int doctorId;
	String medicinePrescribed;
	String doctorComment;
	public int getReportId()
	{
		return reportId;
	}
	public void setReportId(int reportId)
	{
		this.reportId = reportId;
	}
	public int getAppointmentId()
	{
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId)
	{
		this.appointmentId = appointmentId;
	}
	public int getPatientId()
	{
		return patientId;
	}
	public void setPatientId(int patientId)
	{
		this.patientId = patientId;
	}
	public int getDoctorId()
	{
		return doctorId;
	}
	public void setDoctorId(int doctorId)
	{
		this.doctorId = doctorId;
	}
	public String getMedicinePrescribed()
	{
		return medicinePrescribed;
	}
	public void setMedicinePrescribed(String medicinePrescribed)
	{
		this.medicinePrescribed = medicinePrescribed;
	}
	public String getDoctorComment()
	{
		return doctorComment;
	}
	public void setDoctorComment(String doctorComment)
	{
		this.doctorComment = doctorComment;
	}
	
	
}
