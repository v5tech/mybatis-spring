package org.mybatis.spring.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.model.Category;
import org.mybatis.spring.service.CategoryService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class CategoryServiceImplTest {
	
	@Resource(name="categoryServiceImpl")
	private CategoryService categoryService;
	
	
	@Test
	public void listAllCategory(){
		List<Category> list = categoryService.listAllCategory();
		for (Category category : list) {
			System.out.println(category);
		}
	}
	
	@Test
	public void saveCategory(){
		categoryService.saveCategory(new Category("体育"));
	}
	
	@Test
	public void updateCategory(){
		Category category = categoryService.findCategoryById(4);
		category.setName("大家电");
		categoryService.updateCategory(category);
		
		category = categoryService.findCategoryById(5);
		category.setName("小家电");
		categoryService.updateCategory(category);
	}
	
	
	
	@Test
	public void selectCategoryById(){
		Category category = categoryService.selectCategoryById(2);
		System.out.println(category);
	}
}
