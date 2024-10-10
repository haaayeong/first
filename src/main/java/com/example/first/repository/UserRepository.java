package com.example.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.first.domain.UserInfo;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<UserInfo, Integer>{
	
	UserInfo findByUsername(String username);
}
