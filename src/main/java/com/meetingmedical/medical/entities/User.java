package com.meetingmedical.medical.entities;


import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Entity
public class User {

	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	Long id;
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", enabled=" + enabled
				+ ", roles=" + roles + "]";
	}


	@Column
	String username;
	@Column
	String  password;
	@Column 
	boolean enabled;
	@Column 
	String roles="";
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, boolean enabled, String roles) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.roles = roles;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		BCryptPasswordEncoder cryptPasswordEncoder = new BCryptPasswordEncoder();
		this.password = cryptPasswordEncoder.encode(password);
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	
	
	public List<String> getListRoles(){
		return Arrays.asList(roles.split(",")); 
	}
	
}
