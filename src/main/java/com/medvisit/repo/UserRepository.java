package com.medvisit.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.medvisit.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

	@Query(value= "{'userName':'?0','password':'?1'}")
	List<User> findByUserNameAndPassword(String userName,String password);

}
