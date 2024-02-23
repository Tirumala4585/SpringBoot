package com.bank.Bank;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BankApp {
	@PostMapping("/eligible")
	public String details(@RequestParam(name="name") String name,@RequestParam int age) {
		if(age>=20) {
		return name+" is eligible for vote";
		}
		else
		{
			return name+" is not eligible for vote";
		}
		
	}

}
