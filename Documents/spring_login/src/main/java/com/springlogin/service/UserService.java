package com.springlogin.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.springlogin.model.User;
import com.springlogin.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);

}
