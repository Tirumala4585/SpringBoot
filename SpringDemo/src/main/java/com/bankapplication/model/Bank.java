package com.bankapplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	@Entity
	@Table(name="bank")
	public class Bank{
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer	user_id;
		
		@Column
		private String	user_name;
		
		@Column
		private String user_password;
		 
		
		@Column
		private String user_phno;
		
		@Column
		private String user_email;
		
		@Column
		private String user_address;
	

}
