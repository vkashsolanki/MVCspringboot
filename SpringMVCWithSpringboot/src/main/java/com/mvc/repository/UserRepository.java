package com.mvc.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvc.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> 
{
	

}
