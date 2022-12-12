package com.example.practice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.entity.Login;
import com.example.practice.service.LoginService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/login")
	public List<Login> getAllLogins(){
		return loginService.getAllLogins();
		
	}
	
	@PostMapping("/login/add")
	public ResponseEntity<String> addLogin(@RequestBody Login login){
		loginService.addLogin(login);
		return new ResponseEntity<String> ("Login Successfull",HttpStatus.OK);
	}

}
