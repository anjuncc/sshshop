package a.j.shop.service.impl;

import org.springframework.stereotype.Service;

import a.j.shop.model.Category;
import a.j.shop.service.CategoryService;
@Service("categoryService")
public class CategoryServiceImpl extends BaseServiceImpl<Category> implements CategoryService {
	 public CategoryServiceImpl(){
		super();
	}
//	public static void main(String[] args) {
//		new CategoryServiceImpl();
//	}
}
