package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.domain.User;
import com.example.repository.UserRepository;




@SpringBootApplication
public class EMedicineRllApplication implements CommandLineRunner{
	
	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(EMedicineRllApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception{
		userRepository.save(new User(0,"xyz@gmail.com","123","Bharath","Reddy","male","user"));
		userRepository.save(new User(0,"abc@gmail.com","456","Akhil","Reddy","male","doctor"));
		userRepository.save(new User(0,"efg@gmail.com","789","Madhu","Reddy","male","admin"));
		userRepository.save(new User(0,"mno@gmail.com","012","Chinna","Reddy","male","user"));
	}
	
}

