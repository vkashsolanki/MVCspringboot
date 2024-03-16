package com.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mvc.entities.UserEntity;
import com.mvc.repository.UserRepository;


@Service
public class UserServiceImp implements UserService
{
	@Autowired
	UserRepository repository;
	
	@Override
	public void addUser(UserEntity usermodel) {
		repository.save(usermodel);
		
	}

	@Override
	public void updateUser(UserEntity usermodel) {
		repository.save(usermodel); 
		
		
	}

	@Override
	public Optional<UserEntity> getUser(int id) {
		Optional<UserEntity> entity=repository.findById(id);
		return entity;
	}

	@Override
	public void removeEmployee(int id) {
 		
	}

	@Override
	public List<UserEntity> listUser() { 
		return repository.findAll();
	}

}
