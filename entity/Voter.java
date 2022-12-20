package com.example.practice.entity;

import java.util.Date;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Voter {
	
	@Id
	@GeneratedValue
	@Column( name  =  "voter_UID")
	private int voterID;
	private String firstName;
	private String lastName;
	private String gender;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateOfBirth;
	
	private String address;
	private String city;
	private String state;
	private String emailID;
	private long mobileNumber;
	private String password;
	private int contestantID;
	

	
	
	public Voter() {
		
	}

	public Voter(String firstName, String lastName, String gender, Date dateOfBirth, String address, String city,
			String state, String emailID, long mobileNumber, String password, int contestantID) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.city = city;
		this.state = state;
		this.emailID = emailID;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.contestantID = contestantID;
		
	}

	public int getVoterID() {
		return voterID;
	}

	public void setVoterID(int voterID) {
		this.voterID = voterID;
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

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPasswrd(String password) {
		this.password = password;
	}

	public int getContestantID() {
		return contestantID;
	}

	public void setContestantID(int contestantID) {
		this.contestantID = contestantID;
	}



	@Override
	public String toString() {
		return "Voter [voterID=" + voterID + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", city=" + city + ", state="
				+ state + ", emailID=" + emailID + ", mobileNumber=" + mobileNumber + ", passwrd=" + password
				+ ", contestantID=" + contestantID +  "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(emailID, mobileNumber, voterID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voter other = (Voter) obj;
		return Objects.equals(emailID, other.emailID) && mobileNumber == other.mobileNumber && voterID == other.voterID;
	}
	
	


	
	// if age column to be used add that in constructor and getter, setter
	
	

}
