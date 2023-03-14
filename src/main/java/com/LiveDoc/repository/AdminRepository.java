package com.LiveDoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LiveDoc.pojo.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
}
