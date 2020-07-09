package com.medvisit.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.medvisit.model.ScheduleFrequency;

@Repository
public interface ScheduleFrequencyRepo extends MongoRepository<ScheduleFrequency, String> {

	ScheduleFrequency findByDoctorName(String doctorName);

}
