package org.mybatis.spring.service.impl;

import java.util.List;

import org.mybatis.spring.mapper.CategoryMapper;
import org.mybatis.spring.model.Category;
import org.mybatis.spring.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("categoryServiceImpl")
@Transactional(propagation=Propagation.REQUIRED)
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryMapper categoryMapper;
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public List<Category> listAllCategory() {
		return categoryMapper.listAllCategory();
	}

	public Category selectCategoryById(int id) {
		return categoryMapper.selectCategoryById(id);
	}

	public void saveCategory(Category category) {
		categoryMapper.saveCategory(category);
	}

	public void updateCategory(Category category) {
		categoryMapper.updateCategory(category);
	}

	public Category findCategoryById(int id) {
		return categoryMapper.findCategoryById(id);
	}

}
