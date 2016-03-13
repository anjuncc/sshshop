package a.j.shop.service;

import java.util.List;

import a.j.shop.model.Category;

public interface CategoryService extends BaseService<Category>{
	public List<Category> queryJoinAccount(String type,int page,int size);
	public Long getCount(String type);
}
