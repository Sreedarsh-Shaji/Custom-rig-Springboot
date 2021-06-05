package com.cr.CustomRigs.service;

import com.cr.CustomRigs.dto.AdminRepository;
import com.cr.CustomRigs.dto.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@NoArgsConstructor
@AllArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userrepo;


}
