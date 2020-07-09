package com.medvisit.model;

import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Doctor {
	

	private String id;
	
	private String name;
	
	private String speciality;
	
	private float rating;
	
	private List<String> reviews;
	
	private String description;
	
	private Address address ;
	
	
	
	private Map<String,String[]> filledHours;
	
	public Map<String, String[]> getFilledHours() {
		return filledHours;
	}

	public void setFilledHours(Map<String, String[]> filledHours) {
		this.filledHours = filledHours;
	}

	private List<String> availableHours;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public List<String> getReviews() {
		return reviews;
	}

	public void setReviews(List<String> reviews) {
		this.reviews = reviews;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

	public List<String> getAvailableHours() {
		return availableHours;
	}

	public void setAvailableHours(List<String> availableHours) {
		this.availableHours = availableHours;
	}

	
	
	
}
