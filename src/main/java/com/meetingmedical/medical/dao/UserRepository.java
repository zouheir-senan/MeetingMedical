package com.meetingmedical.medical.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meetingmedical.medical.entities.User;



public interface UserRepository extends JpaRepository<User, Long> {
	
	
	User findUserByUsername(String username);
}
