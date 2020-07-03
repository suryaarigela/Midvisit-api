package com.medvisit.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.medvisit.model.Specialities;

@Repository
public interface SpecialityRepository extends MongoRepository<Specialities, String>{

	List<Specialities> findByName(String name);

}
