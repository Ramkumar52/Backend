package com.niit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;

public class ProductTest {
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		ProductDAO productDAO=(ProductDAO) context.getBean("productDAO");
		Product product=(Product) context.getBean("product");
		product.setId("PD002");
		product.setName("AIRCEL");
		product.setDescription("NOTHING");
		product.setPrice(0);

	productDAO.saveorupdate(product);
	}

}
