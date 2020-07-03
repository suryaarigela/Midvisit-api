package com.medvisit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medvisit.model.Doctor;
import com.medvisit.model.Specialities;
import com.medvisit.repo.DoctorRepository;
import com.medvisit.repo.SpecialityRepository;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private SpecialityRepository specialityRepository;
	
	public Doctor postDoctor(Doctor doctor) {
		return this.doctorRepository.save(doctor);
	}

	public List<Doctor> getDoctors(String speciality) {
	
		List<Specialities> specialities=this.specialityRepository.findByName(speciality);
		if(specialities!=null && specialities.size()>0) {
			String code=specialities.get(0).getCode();
			return this.doctorRepository.findBySpeciality(code);
		}
		return null;
	}

}
