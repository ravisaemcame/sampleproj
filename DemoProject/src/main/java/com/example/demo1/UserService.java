package com.example.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepository ur;

	public List<User> getAllUsers() {
		List<User> l1=new ArrayList<User>();
		ur.findAll().forEach(i->l1.add(i));
		return l1;
	}

	public User addUser(User user) {
		return ur.save(user);
	}

	public User getUser(int id) {
		
		User user=ur.findById(id).orElse(null);
		if(user!=null) {
			return user;
		}else {
			throw new UserNotFoundException("User not found "+id);
		}
	}
	
	
}
