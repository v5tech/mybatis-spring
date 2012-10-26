package org.mybatis.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.model.Category;

public interface CategoryMapper {
	
	/**
	 * 查询所有的类别
	 * @return
	 */
	@Select("select * from category")
	List<Category> listAllCategory();
	
	
}
