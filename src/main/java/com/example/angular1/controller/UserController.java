package com.example.angular1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.angular1.model.User;
import com.example.angular1.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	public UserController(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	private final UserRepository userRepository;

	@GetMapping("/users")
	public List<User> getUsers() {
		System.out.println("ejecutando busqueda");
		return (List<User>) userRepository.findAll();
	}

	@PostMapping("/users")
	void addUser(@RequestBody User user) {
		System.out.println("guardando user");
		userRepository.save(user);
	}

}
