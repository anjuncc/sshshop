package a.j.shop.service.impl;

import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import a.j.shop.model.Category;
import a.j.shop.service.CategoryService;

@RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(locations="classpath:applicationContext-*.xml")
@ContextConfiguration(locations = { "classpath:applicationContext-public.xml",
		"classpath:applicationContext-service.xml",
		"classpath:applicationContext-action.xml" })
public class CategoryServiceImplTest {
	@Resource
	CategoryService categoryService;

	@Test
	public final void testSave() {
		categoryService.save(new Category("测试save",true));
	}

	@Test
	public final void testUpdate() {
		categoryService.update(new Category(3,"测试update",true));
	}

	@Test
	public final void testGet() {
	System.out.println(categoryService.get(3));	
		
	}

	@Test
	public final void testQuery() {
		for(Category c:categoryService.query()){
			System.out.println(c);
		}
	}
	@Test
	public final void testDelete() {
		categoryService.delete(3);
	}
}
