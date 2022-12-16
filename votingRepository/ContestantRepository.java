package com.example.practice.votingRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.practice.entity.Contestant;

public interface ContestantRepository extends CrudRepository <Contestant, Integer> {
	
	@Modifying
	@Query("update Contestant set countOfVotes=?1 where contestantID=?2")
	void updateVotesInfo(int countOfVotes,
			int contestantID);
	
	@Modifying
	@Query("update Contestant set status=?1 where contestantID=?2")
	void updateContestantInfo(String status,
			int contestantID);
	
	
}
