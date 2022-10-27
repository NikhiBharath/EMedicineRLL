package com.example.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.User;



@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, Integer> {
	
	
	 User findByEmail(String email);
	 
	  List<User> findAll();
}
