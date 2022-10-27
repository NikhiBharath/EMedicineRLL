package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.domain.User;
import com.example.repository.UserRepository;

@Service("userService")
@Scope("singleton")
public class UserService implements iUserService{
	
	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;
	

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

}
