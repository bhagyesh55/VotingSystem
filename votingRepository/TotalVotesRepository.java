package com.example.practice.votingRepository;

import org.springframework.data.repository.CrudRepository;

import com.example.practice.entity.TotalVotes;

public interface TotalVotesRepository extends CrudRepository<TotalVotes, Integer>{

}
