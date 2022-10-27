package com.example.service;

import java.util.List;


import com.example.domain.User;


public interface iUserService {
	
	User findByEmail(String email);
	void saveUser(User user);
	List<User> findAll();
}
