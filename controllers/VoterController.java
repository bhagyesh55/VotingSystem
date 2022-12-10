package com.example.practice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.entity.Voter;
import com.example.practice.service.VoterService;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
public class VoterController {
	
	@Autowired
	private VoterService voterService;
	
	@GetMapping("/voter")
	public List<Voter> getAllVoters(){
		return voterService.getAllVoters();
	}
	
//	@PostMapping("/voter/emailID/passwrd")
//	public Voter getLoginAndPassword(@PathVariable String emailID, @PathVariable String passwrd){
//		return voterService.getLoginAndPassword(emailID, passwrd);
//	}
	
	@PutMapping("/voter/{voterID}")
	public ResponseEntity<String> updateVoter(@PathVariable int voterID, @RequestBody Voter updatedVoter){
		if(voterID!=updatedVoter.getVoterID()) {
			return new ResponseEntity<String> ("Incorrect Voter ID", HttpStatus.BAD_REQUEST);
		}else {
			return new ResponseEntity<String> ("Details Updated",HttpStatus.OK);
		}
	}
//	
	@PostMapping("/voter")
	public ResponseEntity<String> saveVoter(@RequestBody Voter voter){
		voterService.saveVoter(voter);
		return new ResponseEntity<String> ("Voter added to DB", HttpStatus.CREATED);
	}

}
