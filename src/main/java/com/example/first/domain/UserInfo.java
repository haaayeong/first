package com.example.first.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 20, unique = true)
	private String username;
	
	@Column(nullable = false, length = 20)
	private String password;
	
	@Column(nullable = false, length = 30)
	private String nickname;
	
	@Column(nullable = false)
	private String email;
	
}
