package com.exercise.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exercise.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{
	
}
