package com.niit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.SupplierDAO;
import com.niit.model.Product;
import com.niit.model.Supplier;

public class SupplierTest {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.refresh();
		SupplierDAO supplierDAO=(SupplierDAO) context.getBean("supplierDAO");
		Supplier supplier=(Supplier) context.getBean("supplier");
		supplier.setId("");
		supplier.setName("");
		supplier.setAddress("");

		supplierDAO.saveorupdate(supplier);
	}
}
