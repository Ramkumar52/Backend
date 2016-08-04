package com.niit.dao;

import java.util.List;

import com.niit.model.Category;

public interface CategoryDAO {

	public List<Category> list();
	public Category get(String id);
	public void saveorupdate(Category category);
	public void delete(String id);
}
