package com.example.ej7dto.repository;

import com.example.ej7dto.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, Long> {
}
