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
	private VoterRepository vtr;
	
	@Transactional
	@Override
	public void updateVoter(int voterID, Voter updatedVoter) {
		// TODO Auto-generated method stub
		vtr.updateVoterInfo(updatedVoter.getAddress(), updatedVoter.getCity(), updatedVoter.getState(),
				updatedVoter.getEmailID(), updatedVoter.getMobileNumber(), updatedVoter.getPasswrd(), 
				updatedVoter.getVoterID());

	}

	@Override
	public void saveVoter(Voter voter) {
		// TODO Auto-generated method stub
		vtr.save(voter);

	}

	@Override
	public Voter getVoterById(int voterID) {
		// TODO Auto-generated method stub
		return vtr.findById(voterID).get();
	}

	@Override
	public List<Voter> getAllVoters() {
		// TODO Auto-generated method stub
		return (List<Voter>) vtr.findAll();
	}

	@Override
	public void deleteByVoterId(int voterID) {
		// TODO Auto-generated method stub
		vtr.deleteById(voterID);
	}

	// value compare null  or not null
	
//	@Override
//	public Voter getLoginAndPassword(String emailID, String passwrd) {
//		Optional<Voter> val = vtr.f
//		Optional<Voter> var = vtr.findById(passwrd);
//
//		
//		if (!val.isPresent() && !var.isPresent()) {
//			throw new VoterNotFoundException("Incorrect EmailID or Password");
//		}
//		return val.get();
//			
//	}
	

}
