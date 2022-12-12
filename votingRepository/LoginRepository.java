package com.example.practice.votingRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.practice.entity.Login;

@Repository
public interface LoginRepository extends CrudRepository<Login, Long> {
	
}
