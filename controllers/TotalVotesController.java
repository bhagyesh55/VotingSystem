package com.example.practice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.entity.TotalVotes;
import com.example.practice.service.TotalVotesService;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
public class TotalVotesController {
	
	@Autowired
	private TotalVotesService totalService;
	
	@GetMapping("/totalvotes")
	public List<TotalVotes> getTotalVotes(){
		return (List<TotalVotes>) totalService.getTotalVotes();
	}

}
