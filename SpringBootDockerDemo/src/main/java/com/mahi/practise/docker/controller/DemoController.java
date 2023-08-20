package com.mahi.practise.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahi.practise.docker.entity.User;
import com.mahi.practise.docker.repo.LoginDaoRepository;

@RestController
@RequestMapping("/docker")
public class DemoController {

	@Autowired
	LoginDaoRepository loginDaoRepository;

	@GetMapping("testAPI")
	public String getString() {
		return "Am from docker demo";
	}

	@PostMapping(path = "/add")
	public ResponseEntity<User> add(@RequestBody User user) {
		User resultUser = loginDaoRepository.save(user);
		return new ResponseEntity<>(resultUser, HttpStatus.OK);
	}

	@GetMapping(path = "/all")
	public ResponseEntity<List<User>> getAll() {
		System.out.println("Enter in getAll");
		List<User> userList = loginDaoRepository.findAll();
		return new ResponseEntity<>(userList, HttpStatus.OK);
	}
}
