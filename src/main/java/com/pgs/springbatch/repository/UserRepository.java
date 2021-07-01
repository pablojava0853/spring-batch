package com.pgs.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgs.springbatch.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
