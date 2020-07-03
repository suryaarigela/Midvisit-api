package com.medvisit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medvisit.model.Doctor;
import com.medvisit.service.DoctorService;

@RestController
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/postDoctor")
	public void postDoctor(@RequestBody List<Doctor> doctor) {
	doctor.forEach(doc->{
		this.doctorService.postDoctor(doc);
	});
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/getDoctors")
	public List<Doctor> getDoctors(@RequestBody String speciality){
		return this.doctorService.getDoctors(speciality);
	}
}
