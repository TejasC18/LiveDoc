package com.LiveDoc.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "reports")
@NamedQueries({@NamedQuery(name = "searchByDoctorId",query = "select objReports from Reports objReports where doctorId=?1"),
	@NamedQuery(name = "searchBypatientId",query = "select objReports from Reports objReports where patientId=?1"),
	@NamedQuery(name = "searchByBothId",query = "select objReports from Reports objReports where patientId=?1 and doctorId=?2")})
public class Reports
{
	@Id
	@GeneratedValue(generator = "increment")
	@Column(name = "reportid")
	int reportId;
	
	@Column(name = "appointmentid")
	int appointmentId;
	
	@Column(name = "patientid")
	int patientId;
	
	@Column(name = "doctorid")
	int doctorId;
	
	@Column(name = "medicineprescribed")
	String medicinePrescribed;
	
	@Column(name = "doctorcomment")
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
