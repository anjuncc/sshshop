package a.j.shop.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import a.j.shop.model.Category;
import a.j.shop.service.CategoryService;
import a.j.shop.service.impl.CategoryServiceImpl;



@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:applicationContext-*.xml")
@ContextConfiguration(locations={"classpath:applicationContext-public.xml","classpath:applicationContext-service.xml","classpath:applicationContext-action.xml"})
public class TestControllerTest {
//	@Resource
//	Date date;
	@Resource
	CategoryService categoryService;
	
//	public void data(){
//		System.out.println(">>>>>>>>>>>"+date.getTime());
//	}
//	@Test
//	public void  hibernateSave(){
//		CategoryService catServie = new CategoryServiceImpl();
//		
//		catServie.save(new Category("男人", false));
//	}
	@Test
	public void  hibernateAndSpring(){
		
		categoryService.save(new Category("男人2", false));
	}
}
