package com.meetingmedical.medical.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Patient {


	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	Long id;
	@Column
	String firstname;
	@Column
	String lastname;
	@Column 
	String cin;
	@Column 
	String email;
	@Column
	String adrress;
	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date birthday;
	@Column
	String phonenumbre;
	@OneToOne(targetEntity = User.class,  cascade = CascadeType.ALL)
	@JoinColumn(name="pu_fk",referencedColumnName = "id")
	User user;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(Long id, String firstname, String lastname, String cin, String email, String adrress, Date birthday,
			String phonenumbre, User user) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.cin = cin;
		this.email = email;
		this.adrress = adrress;
		this.birthday = birthday;
		this.phonenumbre = phonenumbre;
		this.user = user;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdrress() {
		return adrress;
	}
	public void setAdrress(String adrress) {
		this.adrress = adrress;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPhonenumbre() {
		return phonenumbre;
	}
	public void setPhonenumbre(String phonenumbre) {
		this.phonenumbre = phonenumbre;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
