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
	

	
	@Transactional
	@Override
	public void updateVote(int contestantID, Contestant updatedContestant) {
		// TODO Auto-generated method stub
		crp.updateVotesInfo(updatedContestant.getCountOfVotes(),
				updatedContestant.getContestantID());
		
	}
//	
	@Transactional
	@Override
	public void updateContestant(int contestantID, Contestant updatedContestant) {
		// TODO Auto-generated method stub
		crp.updateContestantInfo(updatedContestant.getStatus(),updatedContestant.getContestantID());
	}
}
