package com.niit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;
import com.niit.model.Product;

public class CategoryTest {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		CategoryDAO categoryDAO=(CategoryDAO) context.getBean("categoryDAO");
		Category category=(Category) context.getBean("category");
		category.setId("PD004");
		category.setName("AIRTEL");
		category.setDescription("READY");

		categoryDAO.saveorupdate(category);	
	}
}
