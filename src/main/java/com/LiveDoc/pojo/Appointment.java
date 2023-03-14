package com.LiveDoc.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "appointments")
@NamedQueries({@NamedQuery(name = "appointments",query = "select objAppointment from Appointment objAppointment where doctorid=?1 and appointment_status='pending'"),
	@NamedQuery(name = "updateStatus",query = "update Appointment objAppointment set appointment_status='completed' where appointmentId=?1")})
public class Appointment
{
	@Id
	@GeneratedValue(generator = "increment")
	@Column(name = "appointmentid")
	int appointmentId;
	
	@Column(name = "problem")
	String problem;
	
	@Column(name = "patientid")
	int patientId;
	
	@Column(name = "doctorname")
	String doctorName;
	
	@Column(name = "doctorid")
	int doctorId;
	
	@Column(name = "doctortype")
	String doctorType;
	
	@Column(name = "qualification")
	String qualification;
	
	@Column(name = "doctorfees")
	int doctorFees;
	
	@Column(name = "paymentstatus")
	String paymentStatus;
	
	@Column(name = "appointment_status")
	String appointmentStatus;

	@Column(name = "date")
	String date;
	
	@Column(name = "time")
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
