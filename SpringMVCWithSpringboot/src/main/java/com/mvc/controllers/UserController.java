package com.mvc.controllers;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.mvc.entities.UserEntity;
import com.mvc.services.UserService;
 
@Controller
public class UserController 
{
    @Autowired
	UserService service;  
	
	@PostMapping(value  ="/doRegister")
	public String userRegister(@ModelAttribute UserEntity entity)
	{
		if(entity !=null)
		{
			service.addUser(entity);
		}
		return "redirect:/";

		
		
	}
	
	
	
	
}
