package com.example.practice.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contestant {
	
	@Id
	@GeneratedValue
	private int contestantID;
	private String fullName;
	private String gender;
	private String status;
	private String city;
	private String emailID;
	private String image;
	private int countOfVotes;
	
	
	public Contestant() {
		
	}
	
	public Contestant(int contestantID, String fullName, String gender, String status, String city,
			String emailID, String image, int countOfVotes) {
		super();
		this.contestantID = contestantID;
		this.fullName = fullName;
		this.gender = gender;
		this.status = status;
		this.city = city;
		this.emailID = emailID;
		this.image=image;
		this.countOfVotes = countOfVotes;
	}

	public int getContestantID() {
		return contestantID;
	}

	public void setContestantID(int contestantID) {
		this.contestantID = contestantID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCountOfVotes() {
		return countOfVotes;
	}

	public void setCountOfVotes(int countOfVotes) {
		this.countOfVotes = countOfVotes;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	
	
	
	
	
	
	
	
	

}
