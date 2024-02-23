package com.spring.Registration.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.spring.Registration.dto.UserDTO;

public class UserDAO {
	public UserDTO setUserDetails(UserDTO dto) {
		int rst=0;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/User_details","root","root");
		PreparedStatement pst = con.prepareStatement("INSERT INTO user_info(user_name,user_password,full_name,user_phno,user_email)"+"VALUES('"+dto.getUserName()+"','"+dto.getPassword()+"','"+dto.getFullName()+"','"+dto.getPhno()+"','"+dto.getEmail()+"')");
		int result =  pst.executeUpdate();
		if(result==1) {
			return dto;
		}
		}
		
		catch(Exception ie) {
			ie.printStackTrace();
		}
		return null;
	}
	public UserDTO getUserDetails(String name,String password) {
		UserDTO dto =  new UserDTO();
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/User_details","root","root");
		Statement st = con.createStatement();
		ResultSet rst = st.executeQuery("SELECT user_id,user_name,user_password,fullname,user_phno,user_email FROM WHERE user_name='"+name+"' AND user_password='"+password+"'");
		while(rst.next()) {
			dto.setUserId(rst.getInt("user_id"));
		    dto.setUserName(rst.getString("user_name"));
		    dto.setPassword(rst.getString("user_password"));
		    dto.setFullName(rst.getString("full_name"));
		    dto.setPhno(rst.getString("user_phno"));
		    dto.setEmail(rst.getString("user_email"));
		}
		if(dto.getUserId()==0) {
			dto=null;
		}	
		}
		catch(Exception ie) {
			ie.printStackTrace();
		}
		return dto;

}
}