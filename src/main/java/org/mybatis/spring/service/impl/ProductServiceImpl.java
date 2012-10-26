package org.mybatis.spring.service.impl;

import java.util.List;

import org.mybatis.spring.mapper.ProductMapper;
import org.mybatis.spring.model.Product;
import org.mybatis.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("productServiceImpl")
@Transactional(propagation=Propagation.REQUIRED)
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;
	
	
	
	@Transactional(propagation=Propagation.REQUIRED)
	public List<Product> listAllProduct() {
		return productMapper.listAllProduct();
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public List<Product> listProductByCategoryid(int categoryid) {
		return productMapper.listProductByCategoryid(categoryid);
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public List<Product> listAllProductIncludeCategoryName() {
		return productMapper.listAllProductIncludeCategoryName();
	}

	public void insertProduct(Product product) {
		productMapper.insertProduct(product);
	}

	public void updateProduct(Product product) {
		productMapper.updateProduct(product);
	}

	public Product findProductById(int id) {
		return productMapper.findProductById(id);
	}

	public List<Product> like(String name) {
		return productMapper.like("%"+name+"%");
	}

	public List<Product> page(int pageNumber, int pageSize) {
		return productMapper.page(pageNumber, pageSize);
	}

	public List<Product> dynaQuerySql(Product product) {
		return productMapper.dynaQuerySql(product);
	}

}
