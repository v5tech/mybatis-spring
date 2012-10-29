package org.mybatis.spring.controller;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.model.Product;
import org.mybatis.spring.model.Products;
import org.mybatis.spring.service.ProductService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("productController")
@RequestMapping("/product")
public class ProductController {

	@Resource(name="productServiceImpl")
	private ProductService productService;
	
	
	@RequestMapping(value={"/find2json/{id}"},produces=MediaType.APPLICATION_JSON_VALUE,method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody Product findProductByIdToJson(@PathVariable("id")int id){
		Product product=productService.findProductById(id);
		return product;
	}
	
	
	@RequestMapping(value={"/find/all/product/json"},produces=MediaType.APPLICATION_JSON_VALUE,method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody List<Product> findAllProductToJson(){
		List<Product> products=productService.listAllProduct();
		return products;
	}
	
	
	
	@RequestMapping(value={"/find/all/product/xml"},produces=MediaType.APPLICATION_XML_VALUE,method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody Products findAllProductToXML(){
		Products products=new Products();
		List<Product> lists=productService.listAllProduct();
		products.setProducts(lists);
		return products;
	}
	
	
	
	
	@RequestMapping(value={"/find2xml/{id}"},produces=MediaType.APPLICATION_XML_VALUE,method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody Product findProductByIdToXML(@PathVariable("id")int id){
		Product product=productService.findProductById(id);
		return product;
	}
	
	
	
	
	
	
}
