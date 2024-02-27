package com.patilmasala.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patilmasala.model.Address;

@Repository
public interface AddressDao extends JpaRepository<Address, Integer> {

}
