package com.example.practice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TotalVotes {
	@Id
	private int contestantID;
	private String image;
	private String fullName;
	private int countOfVotes;
	
	public TotalVotes() {
		
	}

	public TotalVotes(int contestantID, String image, String fullName, int countOfVotes) {
		
		this.contestantID = contestantID;
		this.image = image;
		this.fullName = fullName;
		this.countOfVotes = countOfVotes;
	}

	public int getContestantID() {
		return contestantID;
	}

	public void setContestantID(int contestantID) {
		this.contestantID = contestantID;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getCountOfVotes() {
		return countOfVotes;
	}

	public void setCountOfVotes(int countOfVotes) {
		this.countOfVotes = countOfVotes;
	}
	
	
	
	
	
	
	

}
