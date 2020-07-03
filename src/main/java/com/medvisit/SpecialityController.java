package com.medvisit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medvisit.model.Specialities;
import com.medvisit.service.SpecialityService;

@RestController
public class SpecialityController {
	
	@Autowired
	private SpecialityService specialityService;
	
	@PostMapping("/postSpecialities")
	public void postSpecialities(@RequestBody List<Specialities> specialities) {
		this.specialityService.postSpecialities(specialities);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getAllSpecialities")
	public List<Specialities> getAllSpecialities(){
		return this.specialityService.getAllSpecialities();
	}

}
