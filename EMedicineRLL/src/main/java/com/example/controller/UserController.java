package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;
import com.example.service.UserService;


@RestController
@Scope("request")
@RequestMapping("/user")
@Controller
public class UserController {
	
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@GetMapping(value="/byEmail/{email}" ,produces = {MediaType.APPLICATION_JSON_VALUE})
	public User findByEmail(@PathVariable String email) {
		return userService.findByEmail(email);
	}
	
	@PostMapping(value="/saveuser" ,produces = {MediaType.APPLICATION_JSON_VALUE} ,
							consumes = {MediaType.APPLICATION_JSON_VALUE})
	public void saveUser(User user) {
		userService.saveUser(user);
	}
	
	@GetMapping(value="/users" ,produces={MediaType.APPLICATION_JSON_VALUE})
	public List<User> findAll(){
		return userService.findAll();
	}

}
