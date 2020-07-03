package com.medvisit.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Specialities {

	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isPopular() {
		return isPopular;
	}
	public void setPopular(boolean isPopular) {
		this.isPopular = isPopular;
	}
	private String code;
	private String name;
	private boolean isPopular;
}
