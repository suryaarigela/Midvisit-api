package com.medvisit.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.medvisit.model.Doctor;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor, String>{

	List<Doctor> findBySpeciality(String code);

}
