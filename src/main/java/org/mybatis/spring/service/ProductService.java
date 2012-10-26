package org.mybatis.spring.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.model.Product;

public interface ProductService {
	
	
	/**
	 * 查询所有的商品
	 * @return
	 */
	List<Product> listAllProduct();
	/**
	 * 根据商品类别查询商品
	 * @return
	 */
	List<Product> listProductByCategoryid(@Param("categoryid")int categoryid);
	
	
	List<Product> listAllProductIncludeCategoryName();
	
	/**
	 * 新增产品
	 * @param product
	 */
	void insertProduct(Product product);
	
	
	
	void updateProduct(Product product);
	
	
	
	Product findProductById(int id);
	
	
	List<Product> like(String name);
	
	
	List<Product> page(int pageNumber,int pageSize);
	
	
	List<Product> dynaQuerySql(Product product);
	
}
