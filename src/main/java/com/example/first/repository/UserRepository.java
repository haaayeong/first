package com.example.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.first.domain.UserInfo;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Integer>{

}
