package com.LiveDoc.dto;

public class AppointmentDTO
{
	int appointmentId;
	String problem;
	int patientId;
	String doctorName;
	int doctorId;
	String doctorType;
	String qualification;
	int doctorFees;
	String paymentStatus;
	String appointmentStatus;
	String date;
	String time;
	public int getAppointmentId()
	{
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId)
	{
		this.appointmentId = appointmentId;
	}
	public String getProblem()
	{
		return problem;
	}
	public void setProblem(String problem)
	{
		this.problem = problem;
	}
	public int getPatientId()
	{
		return patientId;
	}
	public void setPatientId(int patientId)
	{
		this.patientId = patientId;
	}
	public String getDoctorName()
	{
		return doctorName;
	}
	public void setDoctorName(String doctorName)
	{
		this.doctorName = doctorName;
	}
	public int getDoctorId()
	{
		return doctorId;
	}
	public void setDoctorId(int doctorId)
	{
		this.doctorId = doctorId;
	}
	public String getDoctorType()
	{
		return doctorType;
	}
	public void setDoctorType(String doctorType)
	{
		this.doctorType = doctorType;
	}
	public String getQualification()
	{
		return qualification;
	}
	public void setQualification(String qualification)
	{
		this.qualification = qualification;
	}
	public int getDoctorFees()
	{
		return doctorFees;
	}
	public void setDoctorFees(int doctorFees)
	{
		this.doctorFees = doctorFees;
	}
	public String getPaymentStatus()
	{
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus)
	{
		this.paymentStatus = paymentStatus;
	}
	public String getAppointmentStatus()
	{
		return appointmentStatus;
	}
	public void setAppointmentStatus(String appointmentStatus)
	{
		this.appointmentStatus = appointmentStatus;
	}
	public String getDate()
	{
		return date;
	}

	public void setDate(String date)
	{
		this.date = date;
	}
	public String getTime()
	{
		return time;
	}
	public void setTime(String time)
	{
		this.time = time;
	}
	
}
