package com.example.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.entity.TotalVotes;
import com.example.practice.votingRepository.TotalVotesRepository;

@Service
public class TotalVotesServiceImpl implements TotalVotesService {
	
	@Autowired
	private TotalVotesRepository totalVotes;

	@Override
	public List<TotalVotes> getTotalVotes() {
		return (List<TotalVotes>) totalVotes.findAll();
	}

}
