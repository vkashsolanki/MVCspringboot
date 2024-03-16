package com.mvc.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller
public class HomeContoller 
{
 
@GetMapping(value=  "/")	
public String homePage(Model model)
{
model.addAttribute("title","Home Page Spring boot");	
return "index";	
}

@GetMapping(value=  "/register")	
public String registerPage(Model model)
{
model.addAttribute("title","Home Page Spring boot");	
return "registerPage";	
}








	
	
}
