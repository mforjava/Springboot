package com.mahi.practise.docker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "LOGIN_USER")
public class User {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String city;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	public User(long id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
