package com.meetingmedical.medical.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Appointment {
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	Long id;
	String subject;
	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date date;
	String message;
	Long idP;
	Long idD;
	
	
	public Appointment(Long id, String subject, Date date, String message, Long idP, Long idD) {
		super();
		this.id = id;
		this.subject = subject;
		this.date = date;
		this.message = message;
		this.idP = idP;
		this.idD = idD;
	}

	public Long getIdP() {
		return idP;
	}

	public void setIdP(Long idP) {
		this.idP = idP;
	}

	public Long getIdD() {
		return idD;
	}

	public void setIdD(Long idD) {
		this.idD = idD;
	}

	
	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}



	
}

