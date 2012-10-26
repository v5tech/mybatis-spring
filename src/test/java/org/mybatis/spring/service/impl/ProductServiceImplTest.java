package org.mybatis.spring.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.model.Product;
import org.mybatis.spring.service.ProductService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ProductServiceImplTest {
	
	@Resource(name="productServiceImpl")
	private ProductService productService;
	
	@Test
	public void listAllProduct(){
		List<Product> listAllProduct = productService.listAllProduct();
		for (Product product : listAllProduct) {
			System.out.println(product);
		}
	}
	
	
	@Test
	public void listProductByCategoryid(){
		List<Product> listAllProduct = productService.listProductByCategoryid(2);
		for (Product product : listAllProduct) {
			System.out.println(product);
		}
	}
	
	
	@Test
	public void listAllProductIncludeCategoryName(){
		List<Product> listAllProduct = productService.listAllProductIncludeCategoryName();
		for (Product product : listAllProduct) {
			System.out.println(product);
		}
	}
	
	@Test
	public void like(){
		List<Product> listAllProduct = productService.like("ipa");
		for (Product product : listAllProduct) {
			System.out.println(product);
		}
	}
	
	
	@Test
	public void page(){
		List<Product> listAllProduct = productService.page(0, 2);
		for (Product product : listAllProduct) {
			System.out.println(product);
		}
	}
	
	@Test
	public void dynaQuerySql(){
		List<Product> listAllProduct = productService.dynaQuerySql(new Product("ipad", 3000.0f, null, 1));
		for (Product product : listAllProduct) {
			System.out.println(product);
		}
	}
	
	
	@Test
	public void insertProduct(){
		productService.insertProduct(new Product("Iphone5", 5000, "据听说iphone5很丑啊", 2));
	}
	
	
	@Test
	public void findProductById(){
		Product product = productService.findProductById(1);
		System.out.println(product);
	}
	
	
	@Test
	public void updateProduct(){
		
		Product product=productService.findProductById(17);
		product.setDescription("iphone5很丑很贵没有肾了买不起了怎么办啊");
		product.setPrice(8000);
		productService.updateProduct(product);
		
		
	}
	
	
}
