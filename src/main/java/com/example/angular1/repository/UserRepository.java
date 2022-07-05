package com.example.angular1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.angular1.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
}
