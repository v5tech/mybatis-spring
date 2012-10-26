package org.mybatis.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.mybatis.spring.model.Category;

public interface CategoryMapper {
	
	/**
	 * 查询所有的类别
	 * @return
	 */
	@Select("select * from category")
	@ResultMap("categoryResultMap")
	List<Category> listAllCategory();

	/**
	 * 根据id查询Category
	 * @param id
	 * @return
	 */
	Category selectCategoryById(int id);
	
	
	Category findCategoryById(int id);
	
	
	@Insert("insert into category(name) values (#{category.name})")
	void saveCategory(@Param("category")Category category);
	
	@Update("update category set name=#{category.name} where id = #{category.id}")
	void updateCategory(@Param("category")Category category);
}
