package com.patilmasala.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patilmasala.model.Category;

public interface CategoryDao extends JpaRepository<Category, Integer> {
	

}
