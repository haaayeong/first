package com.example.first.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.first.domain.UserInfo;
import com.example.first.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void insertUser(UserInfo user) {
		userRepository.save(user);
	}
	
	public int idCheck(String username) {
		
		UserInfo user = userRepository.findByUsername(username);
		
		if(user == null) {
			return 0;
		} else {
			return 1;
		}
	}

}
