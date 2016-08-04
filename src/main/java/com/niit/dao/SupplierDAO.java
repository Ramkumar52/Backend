package com.niit.dao;

import java.util.List;

import com.niit.model.Supplier;

public interface SupplierDAO {


	public List<Supplier> list();
	public Supplier get(String id);
	public void saveorupdate(Supplier supplier);
	public void delete(String id);
}