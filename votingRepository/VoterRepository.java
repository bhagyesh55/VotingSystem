package com.example.practice.votingRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.practice.entity.Voter;

@Repository
public interface VoterRepository extends CrudRepository<Voter, Integer> {
	
	@Modifying
	@Query("update Voter set address=?1, city=?2, state=?3, emailID=?4, mobileNumber=?5, passwrd=?6 where voterId=?7")
	void updateVoterInfo(String address, String city, String state, String emailID, int mobileNumber, String passwrd, 
			int voterID);
	
	
//	
	
	
	

}