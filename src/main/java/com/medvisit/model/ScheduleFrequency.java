package com.medvisit.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ScheduleFrequency {

	private String id;
	
	private String doctorName;
	
	private List<String> hours;

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public List<String> getHours() {
		return hours;
	}

	public void setHours(List<String> hours) {
		this.hours = hours;
	}
}
