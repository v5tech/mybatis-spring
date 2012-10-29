package org.mybatis.spring.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="products")
public class Products {
	
	private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	@XmlElement(name="product")
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}
