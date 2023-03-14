package com.LiveDoc.services;

import java.util.List;

import com.LiveDoc.dto.ReportsDTO;
import com.LiveDoc.pojo.Reports;

public interface ReportService
{
	public void addReport(ReportsDTO objReport);
	public ReportsDTO searchReportById(int reportId);
	public List<Reports> getReportbyDoctorId(int doctorId);
	public List<Reports> getReportbyPatientId(int patientId);
	public List<Reports> getReportbyBothId(int patientId,int doctorId);
}
