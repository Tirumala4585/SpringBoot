package com.spring.Registration.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Registration.dao.UserDAO;
import com.spring.Registration.dto.UserDTO;

@RestController
@RequestMapping("/register")
public class Controller {
	 UserDAO dao = new UserDAO();
	 UserDTO dto = new UserDTO();
	@GetMapping()
	public String register(@RequestParam(name="uname")String uname, @RequestParam(name="password") String password,@RequestParam(name="fullname") String fullname,@RequestParam(name="phno") String phno, @RequestParam(name="email") String email) {
	   
	    dto.setUserName(uname);
	    dto.setPassword(password);
	    dto.setFullName(fullname);
	    dto.setPhno(phno);
	    dto.setEmail(email);
	    UserDTO userdto = dao.setUserDetails(dto);
	    if(userdto!=null) {
	    	return "Details Successfully Stored";
	    }
	    else {
	    	return "Details Successfully not Stored";
	    }
    }
	@GetMapping("/validate")
	public String validate(@RequestParam(name="uname") String uname , @RequestParam(name="password") String password) {
	    UserDTO userdto=dao.getUserDetails(uname,password);
	    if(userdto.getUserName().equals(uname)&&userdto.getPassword().equals(password)) {
	    	return "Successfully Loggined";
	    }
	    else {
	    	return "Login details are failed";
	    }
	    
	}
	
}
