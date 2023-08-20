package com.mahi.practise.docker.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahi.practise.docker.entity.User;


public interface LoginDaoRepository extends JpaRepository<User, Long> {

}
