package com.LiveDoc.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LiveDoc.dto.AppointmentDTO;
import com.LiveDoc.pojo.Appointment;
import com.LiveDoc.repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService
{
	@Autowired
	AppointmentRepository repositoryAppointment;
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Appointment> getAppointments(int doctorId)
	{
		try(Session session = sessionFactory.openSession())
		{
			Query query = session.getNamedQuery("appointments");
			query.setParameter(1,doctorId);
			List<Appointment> list = query.getResultList();
			return list;
		}catch (Exception e) {
			return null;
		}
	}
	
	@Override
	public void updateAppointments(int appointmentId)
	{
		try(Session session = sessionFactory.openSession())
		{
			Query query = session.getNamedQuery("updateStatus");
			query.setParameter(1,appointmentId);
			Transaction tx = session.beginTransaction();
			query.executeUpdate();
			tx.commit();
			
		}catch (Exception e) {
		}
	}
	
	@Override
	public boolean addAppointment(AppointmentDTO objAppointment)
	{
		Appointment appointmentEntity = new Appointment();
		BeanUtils.copyProperties(objAppointment, appointmentEntity);
		repositoryAppointment.save(appointmentEntity);
		return true;
	}
	
	@Override
	public boolean removeAppointment(int appointmentId)
	{
		repositoryAppointment.deleteById(appointmentId);
		return true;
	}
}
