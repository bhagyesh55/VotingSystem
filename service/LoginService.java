package com.example.practice.service;

import java.util.List;

import com.example.practice.entity.Login;

public interface LoginService {
	
	List<Login> getAllLogins();
    void addLogin(Login login);
    
    

}
