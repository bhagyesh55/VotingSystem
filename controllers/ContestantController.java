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

import com.example.practice.entity.Contestant;
import com.example.practice.service.ContestantService;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
public class ContestantController {
	
	@Autowired
	private ContestantService contestantService;
	
	@GetMapping("/contestant")
	public List<Contestant> getAllContestants(){
		return (List<Contestant>) contestantService.getAllContestants();
	}
	
	@PostMapping("/contestant")
	public ResponseEntity<String> saveContestant(@RequestBody Contestant contestant){
		contestantService.saveContestant(contestant);
		return new ResponseEntity<String> ("Contestant added to DB",HttpStatus.OK);
	}
	
	@PutMapping("/contestant/{contestantID}")
	public ResponseEntity<String> updateContestant(@PathVariable int contestantID, @RequestBody Contestant updatedContestant){
		contestantService.updateContestant(contestantID,updatedContestant);
		return new ResponseEntity<String> ("Contestant updated",HttpStatus.OK);
	}

}
