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
	private String passwrd;
	private String firstName;
	private String lastName;
	private String gender;
	private Date dateOfBirth;
//	private int age;
	private String address;
	private String city;
	private String state;
	private String emailID;
	private int mobileNumber;
//	private int countOfVotes;
	
	public Contestant() {
		
	}
	
	

	public Contestant(int contestantID, String passwrd, String firstName, String lastName, String gender,
			Date dateOfBirth, String address, String city, String state, String emailID, int mobileNumber
			) {
		this.contestantID = contestantID;
		this.passwrd = passwrd;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
//		this.age = age;
		this.address = address;
		this.city = city;
		this.state = state;
		this.emailID = emailID;
		this.mobileNumber = mobileNumber;
//		this.countOfVotes = countOfVotes;
	}
	
	// if age column and countOfvotes column to be used add that in constructor and getter, setter

	public int getContestantID() {
		return contestantID;
	}

	public void setContestantID(int contestantID) {
		this.contestantID = contestantID;
	}

	public String getPasswrd() {
		return passwrd;
	}

	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/*
	 * public int getAge() { return age; }
	 * 
	 * public void setAge(int age) { this.age = age; }
	 */

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/*
	 * public int getCountOfVotes() { return countOfVotes; }
	 * 
	 * public void setCountOfVotes(int countOfVotes) { this.countOfVotes =
	 * countOfVotes; }
	 */
	
	
	
	
	
	

}
