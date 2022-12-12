package com.example.practice.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
	
	@Id
    private long mobileNumber;
    private String emailID;
    private String password;
    private String loginStatus;
	public Login() {
		super();
	}
	public Login(long mobileNumber, String emailID, String password, String loginStatus) {
		super();
		this.mobileNumber = mobileNumber;
		this.emailID = emailID;
		this.password = password;
		this.loginStatus = loginStatus;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}
	@Override
	public String toString() {
		return "Login [mobileNumber=" + mobileNumber + ", emailID=" + emailID + ", password=" + password
				+ ", loginStatus=" + loginStatus + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(mobileNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		return mobileNumber == other.mobileNumber;
	}

    
 
}
