package com.multiplex.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class Users {
	
	@Id
	@GeneratedValue(generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
	@Column(name = "userId")
	private long userId;

	@Column(name = "userName")
	@NotNull(message = "Please Enter user name")
	@NotEmpty(message = "Please Enter user Name. Name can not be blank.")
	private String userName;

	@Column(name = "userType")
	private char userType;

	@Column(name = "emailId", unique = true)
	@NotNull(message = "Please Enter Email")
	@NotEmpty(message = "Please Enter Email. Email can not be blank.")
	@Email
	private String emailId;

	@Column(name = "password")
	@Size(min = 6, message = "Password must be a greater than 6 characters")
	@Pattern(regexp = "[a-zA-z0-9]{6,}", message = "must match proper format.")
	private String password;

	@Column(name = "mobileNo", unique = true)
	@Size(min = 11, max = 11, message = "Mobile number must be a 11-digit string.")
//@Pattern(regexp="0[0-9]{10}",message="Contact should start with 0 and enter proper contact.") 
	private String mobileNo;

	@OneToMany(mappedBy = "users")
	private List<Booking> booking;

	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char getUserType() {
		return userType;
	}

	public void setUserType(char userType) {
		this.userType = userType;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", userType=" + userType + ", emailId=" + emailId
				+ ", password=" + password + ", mobileNo=" + mobileNo + "]";
	}


}
