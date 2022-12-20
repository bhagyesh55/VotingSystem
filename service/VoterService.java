 package com.example.practice.service;

import java.util.List;

import com.example.practice.entity.Voter;

public interface VoterService {
	
	Voter getVoterById(int voterID);
	
	List<Voter> getAllVoters();

	void updateVoter(int voterID, Voter updatedVoter);
	
	void updateVote(int voterID, Voter updatedVoter);
	
	void addVoter(Voter voter);
	
	void deleteByVoterId(int voterID);
	
//	void addVote(int contestantID,Voter updatedVoter);
	
	//Voter getLoginAndPassword(String emailID, String passwrd);
	
	
	

}
