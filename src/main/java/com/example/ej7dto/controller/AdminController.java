package com.example.ej7dto.controller;

import com.example.ej7dto.entity.Admin;
import com.example.ej7dto.repository.IAdminRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
@AllArgsConstructor
public class AdminController {
    private IAdminRepository adminRepository;

    @GetMapping("/admins")
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

}
