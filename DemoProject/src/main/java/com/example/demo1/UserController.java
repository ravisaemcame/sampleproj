package com.example.demo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	UserService userService;

	@GetMapping("/users")
	public List<User> getAllUsers(){
		return  userService.getAllUsers();
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable  int id){
		return  userService.getUser(id);
	}
	@PostMapping("/user")
	public User addStudent(@RequestBody User user) {
		return userService.addUser(user);
	}
}
