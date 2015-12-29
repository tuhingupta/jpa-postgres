package com.spring.jpa.postgres.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Tuhin Gupta
 *
 */
@Entity
public class Customer {
	
	
	@GeneratedValue
	@Id
	Integer id;
	String name;
	String addr;
	String city;
	String state;
	String zip;
	
	
	public Customer() {
		super();
	}


	public Customer(String name, String addr, String city, String state, String zip) {
		super();
		this.name = name;
		this.addr = addr;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
	

}
