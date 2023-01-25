package org.sfw.boot.micro.service.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
	private Long userID;
	private String name;
	private int phone;
	
	List<Contact> contacts=new ArrayList<>();
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Long userID, String name, int phone, List<Contact> contacts) {
		super();
		this.userID = userID;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
	}
	public User(Long userID, String name, int phone) {
		super();
		this.userID = userID;
		this.name = name;
		this.phone = phone;
	}
	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	
	
	
}
