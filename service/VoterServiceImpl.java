package com.example.practice.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.entity.Voter;
import com.example.practice.exception.VoterNotFoundException;
import com.example.practice.votingRepository.VoterRepository;


@Service
public class VoterServiceImpl implements VoterService {
	
	@Autowired
	private VoterRepository voterRepo;
	
	@Transactional
	@Override
	public void updateVoter(int voterID, Voter updatedVoter) {
		// TODO Auto-generated method stub
		voterRepo.updateVoterInfo(updatedVoter.getAddress(), updatedVoter.getCity(), 
				updatedVoter.getState(), updatedVoter.getEmailID(),updatedVoter.getMobileNumber(), 
				updatedVoter.getPassword(), updatedVoter.getVoterID());

	}

	@Override
	public void addVoter(Voter voter) {
		// TODO Auto-generated method stub
		voterRepo.save(voter);

	}

	@Override
	public Voter getVoterById(int voterID) {
		// TODO Auto-generated method stub
		return voterRepo.findById(voterID).get();
	}

	@Override
	public List<Voter> getAllVoters() {
		// TODO Auto-generated method stub
		return (List<Voter>) voterRepo.findAll();
	}

	@Override
	public void deleteByVoterId(int voterID) {
		// TODO Auto-generated method stub
		voterRepo.deleteById(voterID);
	}
	
	@Transactional
	@Override
	public void updateVote(int voterID, Voter updatedVoter) {
		voterRepo.updateVoteInfo(updatedVoter.getContestantID(), updatedVoter.getVoterID());
		// TODO Auto-generated method stub
		
	}
	
//	@Transactional
//	@Override
//	public void addVote(int voterID, Voter updatedVoter) {
//		vtr.updateContestantID(updatedVoter.getContestantID(),updatedVoter.getVoterID());
//		
//	}
//
//	@Override
//	public void addVoter(Voter voter) {
//		// TODO Auto-generated method stub
////		
//	}

}
