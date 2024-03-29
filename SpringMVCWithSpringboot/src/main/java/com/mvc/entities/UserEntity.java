package com.mvc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class UserEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String name,email,mobile,password;
	
}
