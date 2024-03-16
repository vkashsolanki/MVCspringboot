package com.mvc.services;

import java.util.List;
import java.util.Optional;

import com.mvc.entities.UserEntity;

public interface UserService {

	public void addUser(UserEntity usermodel);
	
	public void updateUser(UserEntity usermodel);
	
	public Optional<UserEntity> getUser(int id);
	
	public void removeEmployee(int id);
	
	public List<UserEntity> listUser();

}
