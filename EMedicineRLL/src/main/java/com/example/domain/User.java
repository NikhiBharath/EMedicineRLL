package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Transient;


@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "username", nullable = false, unique = true)
	@Email(message = "Please provide a valid e-mail")
	@NotEmpty(message = "Please provide an e-mail")
	private String email;
	
	@Column(name = "password")
	@Transient
	private String password;
	
	@Column(name = "first_name")
	@NotEmpty(message = "Please provide your first name")
	private String firstName;
	
	@Column(name = "last_name")
	@NotEmpty(message = "Please provide your last name")
	private String lastName;
	
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "authority")
	private String role;
	
	
	public User() {
		
	}


	public User(int id,
			@Email(message = "Please provide a valid e-mail") @NotEmpty(message = "Please provide an e-mail") String email,
			String password, @NotEmpty(message = "Please provide your first name") String firstName,
			@NotEmpty(message = "Please provide your last name") String lastName, String gender, String role) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.role = role;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", email=" + email + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", gender=" + gender + ", role=" + role + "]";
	}


	
	

}
