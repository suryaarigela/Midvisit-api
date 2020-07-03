package com.medvisit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medvisit.model.Specialities;
import com.medvisit.repo.SpecialityRepository;

@Service
public class SpecialityService {

	@Autowired
	private SpecialityRepository specialityRepository;
	
	public List<Specialities> getAllSpecialities(){
		
		return this.specialityRepository.findAll();
	}

	public void postSpecialities(List<Specialities> specialities) {
		specialities.forEach(speciality->{
			this.specialityRepository.save(speciality);
		});
		
	}
}
