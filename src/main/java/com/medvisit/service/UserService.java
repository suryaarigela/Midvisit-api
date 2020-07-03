package com.medvisit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medvisit.model.User;
import com.medvisit.model.UserRequest;
import com.medvisit.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User postUser(User user) {
		return this.userRepository.save(user);
	}

	public List<User> validateUser(UserRequest request) {
		return this.userRepository.findByUserNameAndPassword(request.getUserName(),request.getPassword());
	}
}
