package com.LiveDoc.services;

import org.springframework.web.bind.annotation.PathVariable;

import com.LiveDoc.dto.AdminDTO;

public interface AdminService {
    public boolean adminLogin(@PathVariable("adminId")int adminId,@PathVariable("password")String password);
    public AdminDTO getAdminById(int adminId);
}
