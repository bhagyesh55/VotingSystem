package com.example.practice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	
	public VoterController() {
	
	}
	
	public VoterService getVoterService() {
		return voterService;
	}

	public void setVoterService(VoterService voterService) {
		this.voterService = voterService;
	}

	@Autowired
	private VoterService voterService;
//	private LoginService loginService;
	
	@GetMapping("/voters")
	public List<Voter> getAllVoters(){
		return voterService.getAllVoters();
	}
	
	@GetMapping("/voters/{voterID}")
	public Voter getVoterById(@PathVariable int voterID) {
		return voterService.getVoterById(voterID);
	}
	
	@PostMapping("/voter/add")
	public ResponseEntity<String> addVoter(@RequestBody Voter voter){
		voterService.addVoter(voter);
		return new ResponseEntity<String> ("New Voter is added", HttpStatus.OK);
	}
	
	@PutMapping("/voter/update/{voterID}")
	public ResponseEntity<String> updateVoter(@PathVariable int voterID, @RequestBody Voter updatedVoter){
		voterService.updateVoter(voterID, updatedVoter);
		return new ResponseEntity<String> ("Voter updated successfully", HttpStatus.OK);
	}
	
	@DeleteMapping("/voter/delete/{voterID}")
	public ResponseEntity<String> deleteByVoterId(@PathVariable int voterID){
		voterService.deleteByVoterId(voterID);
		return new ResponseEntity<String> ("Voter deleted", HttpStatus.OK);
	}
	
	@PutMapping("/voter/votes/{voterID}")
	public ResponseEntity<String> updateVote(@PathVariable int voterID, @RequestBody Voter updatedVoter){
		voterService.updateVote(voterID, updatedVoter);
		return new ResponseEntity<String> ("Voted!!!", HttpStatus.OK);
	}
	
//	@PostMapping("/voter")
//	public ResponseEntity<String> addVote(@PathVariable int contestantID, @RequestBody Voter updatedVoter){
//		if(contestantID != 0) {
//			return new ResponseEntity<String> ("You have already voted", HttpStatus.BAD_REQUEST);
//		} else {
//			voterService.addVote(contestantID, updatedVoter);
//			return new ResponseEntity<String> ("Voted Successfully", HttpStatus.BAD_REQUEST);
//		}
//	}

}
