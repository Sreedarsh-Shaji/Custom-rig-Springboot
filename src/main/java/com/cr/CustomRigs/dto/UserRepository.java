package com.cr.CustomRigs.dto;

import com.cr.CustomRigs.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
