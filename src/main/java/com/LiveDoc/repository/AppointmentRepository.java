package com.LiveDoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LiveDoc.pojo.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer>
{

}
