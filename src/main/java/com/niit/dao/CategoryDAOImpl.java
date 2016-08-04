package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Category;


	@Repository("categoryDAO")
	public class CategoryDAOImpl implements CategoryDAO
	{
		@Autowired
		private SessionFactory sessionFactory;
		public CategoryDAOImpl(SessionFactory sessionFactory)
		{
			this.sessionFactory=sessionFactory;
		}
		@Transactional
		public void saveorupdate(Category category)
		{
			sessionFactory.getCurrentSession().saveOrUpdate(category);
		}
		@Transactional
		public void delete(String id)
		{
			Category categorytodelete=new Category();
			categorytodelete.setId(id);
			sessionFactory.getCurrentSession().delete(categorytodelete);
		}
		@Transactional
		public Category get(String id)
		{
			String hql="from Category where id="+"'"+id+"'";
			Query query=(Query) sessionFactory.getCurrentSession().createQuery(hql);
			@SuppressWarnings("unchecked")
			List<Category> listcategory=(List<Category>)query.list();
			if(listcategory!=null && listcategory.isEmpty())
			{
				return listcategory.get(0);
			}
			return null;
		}
		@Transactional
		public List<Category> list(){
			@SuppressWarnings("unchecked")
			List<Category> listcategory=(List<Category>) sessionFactory.getCurrentSession().createCriteria(Category.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return listcategory;
		}
	}
	
	

