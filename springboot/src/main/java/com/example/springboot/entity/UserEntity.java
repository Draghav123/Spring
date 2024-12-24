package com.example.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="springdetails")
public class UserEntity {

	@Id
	@Column(name="uid")
	private Integer uid;
	@Column(name="userName")
	private String userName;
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserEntity(Integer uid, String userName) {
		super();
		this.uid = uid;
		this.userName = userName;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "UserEntity [uid=" + uid + ", userName=" + userName + "]";
	}
	
	
	
	
}
