package com.niit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.UserDAO;
import com.niit.model.User;

public class UserTest {
	
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.refresh();
		UserDAO userDAO=(UserDAO) context.getBean("userDAO");
		User user=(User) context.getBean("user");
		user.setId("");
		user.setName("");
		user.setPassword("");
		user.setMailid("");
		user.setAddress("");
		user.setMobile(0);

		userDAO.saveorupdate(user);
	}

}
