package com.qa.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	// attributes
	// This class needs to have:
	// An ID
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	// An Account Number
	@Column(length=100)
	private String accountNumber = "";
	// A First Name
	@Column(length=50)
	private String firstName = "";
	// A Last Name
	@Column(length=50)
	private String lastName = "";
	
	// constructor
	public Account() {}
	public Account(String firstName, String lastName, String accountNumber, int id) {
		this.id = id;
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	// behaviours
	
	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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

}
