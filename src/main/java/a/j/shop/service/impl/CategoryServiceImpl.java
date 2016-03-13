package a.j.shop.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import a.j.shop.model.Category;
import a.j.shop.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl extends BaseServiceImpl<Category> implements
		CategoryService {
	public CategoryServiceImpl() {
		super();
	}

	/**
	 * 加fetch 装配关联对象
	 */
	@Override
	public List<Category> queryJoinAccount(String type, int page, int size) {
		return getSession()
				.createQuery(
						"from Category c left join fetch c.account where c.type like :type")
				.setString("type", "%" + type + "%")
				.setFirstResult((page - 1) * size).setMaxResults(size).list();

	}

	@Override
	public Long getCount(String type) {
		String hql = "select count(c) from Category c where c.type like :type";
		return (Long) getSession().createQuery(hql)
				.setString("type", "%" + type + "%").uniqueResult();

	}
}
