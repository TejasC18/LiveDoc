package com.LiveDoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LiveDoc.pojo.Patients;

@Repository
public interface PatientRepository extends JpaRepository<Patients,Integer> {
}
