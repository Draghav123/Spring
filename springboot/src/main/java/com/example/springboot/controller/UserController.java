package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.entity.UserEntity;
import com.example.springboot.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/saveuser")
	public void saveUser(@RequestBody UserEntity user) {
		userService.saveUser(user);

	}

	@DeleteMapping("/deleteuser")
	public void deleteUser(UserEntity user) {
		userService.deleteUser(user);
	}

	@GetMapping("/findbyid/{uid}")
	public ResponseEntity<UserEntity> findById(@PathVariable Integer uid) {
		return userService.findById(uid);
	}

	@GetMapping("/findbyname/{userName}")
	public ResponseEntity<UserEntity> findByName(@PathVariable String userName) {
		return userService.findByName(userName);
	}

}
