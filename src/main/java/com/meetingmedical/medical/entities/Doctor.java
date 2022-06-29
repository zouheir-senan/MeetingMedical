package com.meetingmedical.medical.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	Long id;
	@Column
	String name;
	@Column
	String adrress;
	@Column
	String info;
	@Column
	String image;
	@Column 
	int experiences;
	@Column
	String phonenumbre;
	@Column
	String specialist;
	@Column 
	int review;

	public Doctor(Long id, String name, String adrress, String info, String image, int experiences, String phonenumbre,
			String specialist, int review) {
		super();
		this.id = id;
		this.name = name;
		this.adrress = adrress;
		this.info = info;
		this.image = image;
		this.experiences = experiences;
		this.phonenumbre = phonenumbre;
		this.specialist = specialist;
		this.review = review;
	}
	
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdrress() {
		return adrress;
	}
	public void setAdrress(String adrress) {
		this.adrress = adrress;
	}

	public String getInfo() {
		return info;
	}



	public void setInfo(String info) {
		this.info = info;
	}



	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getExperiences() {
		return experiences;
	}
	public void setExperiences(int experiences) {
		this.experiences = experiences;
	}
	public String getPhonenumbre() {
		return phonenumbre;
	}
	public void setPhonenumbre(String phonenumbre) {
		this.phonenumbre = phonenumbre;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public int getReview() {
		return review;
	}
	public void setReview(int review) {
		this.review = review;
	}
	
	
	
}
