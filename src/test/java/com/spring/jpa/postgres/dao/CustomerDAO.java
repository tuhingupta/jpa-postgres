package com.spring.jpa.postgres.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpa.postgres.model.Customer;

/**
 * @author Tuhin Gupta
 *
 */
@Repository
public interface CustomerDAO extends CrudRepository<Customer, String>{
	
	public List<Customer> findByZip(String zip);

}
