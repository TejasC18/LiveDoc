package com.LiveDoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LiveDoc.pojo.Doctors;

@Repository
public interface DoctorRepository extends JpaRepository<Doctors,Integer> {
}
