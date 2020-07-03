package com.medvisit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medvisit.model.User;
import com.medvisit.model.UserRequest;
import com.medvisit.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/getUser")
	public String getUser() {
	   return "Surya";	
	}
	
	@CrossOrigin("http://localhost:4200")
	@PostMapping("/signUp")
	public User postUser(@RequestBody User user) {
		return this.userService.postUser(user);
	}
	
	@CrossOrigin("http://localhost:4200")
	@PostMapping("/validateUser")
	public List<User> validateUser(@RequestBody UserRequest request) {
		return this.userService.validateUser(request);
	}
	
}
