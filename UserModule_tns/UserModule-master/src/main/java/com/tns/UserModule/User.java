package com.tns.UserModule;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@Column(name="uid")
	private int uid;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="emailId")
	private String emailId;
	
	@Column(name="password")
	private String password;
	
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int uid, String userName, String emailId, String password) {
		super();
		this.uid = uid;
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", userName=" + userName + ", emailId=" + emailId + ", password=" + password + "]";
	}
	
	

}
