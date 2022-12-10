package com.example.practice.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.entity.Contestant;
import com.example.practice.exception.VoterNotFoundException;
import com.example.practice.votingRepository.ContestantRepository;


@Service
public class ContestantServiceImpl implements ContestantService {
	
	@Autowired
	private ContestantRepository crp;
	
	
	@Transactional
	@Override
	public void updateContestant(int contestantID, Contestant updatedContestant) {
		// TODO Auto-generated method stub
		crp.updateContestantInfo(updatedContestant.getAddress(), updatedContestant.getCity(), 
				updatedContestant.getState(), updatedContestant.getPasswrd(), updatedContestant.getMobileNumber(), 
				updatedContestant.getContestantID());

	}

	@Override
	public void saveContestant(Contestant contestant) {
		// TODO Auto-generated method stub
		crp.save(contestant);

	}

	@Override
	public Contestant getContestantById(int contestantID) {
		// TODO Auto-generated method stub
		return crp.findById(contestantID).get();
	}

	@Override
	public List<Contestant> getAllContestants() {
		// TODO Auto-generated method stub
		return (List<Contestant>) crp.findAll();
	}

	@Override
	public void deleteByContestantId(int contestantID) {
		crp.deleteById(contestantID);
		
	}
	
//	@Override
//	public Contestant getLoginAndPassword(String emailID, String passwrd) {
//		Optional<Contestant> val = crp.findById(emailID);
//		Optional<Contestant> var = crp.findById(passwrd);
//		
//		if (!val.isPresent() && !var.isPresent()) {
//			throw new VoterNotFoundException("Incorrect EmailID or Password");
//		}
//		return val.get();
//	}

}
