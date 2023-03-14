package com.LiveDoc.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LiveDoc.dto.ReportsDTO;
import com.LiveDoc.pojo.Reports;
import com.LiveDoc.repository.ReportsRepository;

@Service
public class ReportServiceImpl implements ReportService
{
	@Autowired
	ReportsRepository reportsRepository;
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Reports> getReportbyDoctorId(int doctorId)
	{
		try(Session session = sessionFactory.openSession())
		{
			Query query = session.getNamedQuery("searchByDoctorId");
			query.setParameter(1,doctorId);
			List<Reports> list = query.getResultList();
			return list;
		}catch (Exception e) {
			return null;
		}
	}
	
	@Override
	public List<Reports> getReportbyPatientId(int patientId)
	{
		try(Session session = sessionFactory.openSession())
		{
			Query query = session.getNamedQuery("searchBypatientId");
			query.setParameter(1,patientId);
			List<Reports> list = query.getResultList();
			return list;
		}catch (Exception e) {
			return null;
		}
	}
	
	@Override
	public List<Reports> getReportbyBothId(int patientId,int doctorId)
	{
		try(Session session = sessionFactory.openSession())
		{
			Query query = session.getNamedQuery("searchByBothId");
			query.setParameter(1,patientId);
			query.setParameter(2,doctorId);
			List<Reports> list = query.getResultList();
			return list;
		}catch (Exception e) {
			return null;
		}
	}
	
	@Override
	public void addReport(ReportsDTO objReport)
	{
		Reports reportEntity = new Reports();
		BeanUtils.copyProperties(objReport, reportEntity);
		reportsRepository.save(reportEntity);
	}
	
	@Override
	public ReportsDTO searchReportById(int reportId)
	{
		Optional<Reports> optReport = reportsRepository.findById(reportId);
		if(optReport.isPresent())
		{
			Reports reportEntity = optReport.get();
			ReportsDTO dtoReport = new ReportsDTO();
			BeanUtils.copyProperties(reportEntity, dtoReport);
			return dtoReport;
		}
		return null;
	}
	
	
}
