package a.j.shop.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import a.j.shop.model.Category;
import a.j.shop.service.CategoryService;
import a.j.shop.utils.HibernateSessionFactory;

public class CategoryServiceImpl extends BaseServiceImpl<Category> implements CategoryService {
	 public CategoryServiceImpl(){
		super();
	}
//	public static void main(String[] args) {
//		new CategoryServiceImpl();
//	}
}
