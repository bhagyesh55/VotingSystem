package com.example.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.entity.Login;
import com.example.practice.votingRepository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	public LoginRepository loginRepository;

	@Override
    public List<Login> getAllLogins() {
        return (List<Login>) loginRepository.findAll();
    }

    @Override
    public void addLogin(Login login) {
        loginRepository.save(login);
    }
	

}
