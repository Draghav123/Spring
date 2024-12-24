package com.example.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.springboot.entity.UserEntity;
import com.example.springboot.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;


	List<UserEntity> l = new ArrayList<UserEntity>();

	public UserEntity saveUser(UserEntity user) {

		if (user.getUid() == null) {
			user.setUid(1001);
		}
		l.add(user);
		userRepository.save(user);
		return user;
	}

	public void deleteUser(UserEntity user) {
		userRepository.deleteAll();
	}
	
	 public ResponseEntity<UserEntity> findById(Integer uid) {
	        return userRepository.findById(uid)
	            .map(ResponseEntity::ok) // Return user details if found
	            .orElseGet(() -> ResponseEntity.status(404).body(null)); // Return 404 if not found
	    }
	 public ResponseEntity<UserEntity> findByName(String userName) {
		 Optional<UserEntity> user = userRepository.findByUserName(userName);
	        return user.map(ResponseEntity::ok)
	                   .orElseGet(() -> ResponseEntity.status(404).body(null));
	    }
	}

