package com.example.practice.service;

import java.util.List;

import com.example.practice.entity.Contestant;

public interface ContestantService {
	
	Contestant getContestantById(int contestantID);
	
	List<Contestant> getAllContestants();
	
	void saveContestant(Contestant contestant);
	
	void updateVote(int countOfVotes, Contestant updatedContestant);
	
	void updateContestant(int contestantID, Contestant updatedContestant);
	
	void deleteByContestantId(int contestantID);
	
	//Contestant getLoginAndPassword(String emailID, String passwrd);
	

}
