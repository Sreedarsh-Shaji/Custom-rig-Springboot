package com.cr.CustomRigs.dto;

import com.cr.CustomRigs.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Integer>
{
}
