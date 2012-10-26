package org.mybatis.spring.service;

import java.util.List;

import org.mybatis.spring.model.Category;

public interface CategoryService {
	
	
	List<Category> listAllCategory();
	
	
	Category selectCategoryById(int id);
	
	void saveCategory(Category category);
	
	
	void updateCategory(Category category);
	
	Category findCategoryById(int id);
	
}
