package com.LiveDoc.services;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LiveDoc.dto.AdminDTO;
import com.LiveDoc.pojo.Admin;
import com.LiveDoc.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    AdminRepository repositoryAdmin;

    @Override
    public boolean adminLogin(int adminId, String password) {
        Optional<Admin> optionalAdmin = repositoryAdmin.findById(adminId);
        if (optionalAdmin.isPresent())
        {
            Admin objAdmin = optionalAdmin.get();
            if (objAdmin.getPassword().equals(password))
            {
                return true;
            }
        }
        return false;
    }
    
    public AdminDTO getAdminById(int adminId)
    {
    	Optional<Admin> optAdmin = repositoryAdmin.findById(adminId);
        if(optAdmin.isPresent())
        {
        	AdminDTO dtoAdmin = new AdminDTO();
            BeanUtils.copyProperties(optAdmin,dtoAdmin);
            return dtoAdmin;
        }
        return null;
    }
}
