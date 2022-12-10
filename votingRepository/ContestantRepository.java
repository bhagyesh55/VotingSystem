package com.example.practice.votingRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.practice.entity.Contestant;

public interface ContestantRepository extends CrudRepository <Contestant, Integer> {
	
	@Modifying
	@Query("update Contestant set address=?1, city=?2, state=?3, passwrd=?4, mobileNumber=?5 where contestantID=?6")
	void updateContestantInfo(String address, String city, String state, String passwrd, int mobileNumber,
			int contestantID);
}
