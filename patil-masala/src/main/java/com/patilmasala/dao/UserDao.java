package com.patilmasala.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patilmasala.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
	
	User findByEmailIdAndPasswordAndRole(String emailId, String password, String role);
	List<User> findByRole(String role);

}
