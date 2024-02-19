package com.bankapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankapplication.model.*;

public interface BankRepository extends JpaRepository<Bank,Integer>{
	
	      //Bank getUserId(int bankId);

		//Bank checkCredentials(String username, String password);

}
