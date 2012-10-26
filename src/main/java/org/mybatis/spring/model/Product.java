package org.mybatis.spring.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("serial")
@XmlRootElement(name="product")
public class Product implements Serializable{

	private int id;
	
	private String name;
	
	private float price;
	
	private String description;
	
	private int categoryid;
	
	private Category category = new Category();

	public int getId() {
		return id;
	}
	@XmlElement
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}
	@XmlElement
	public void setPrice(float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}
	@XmlElement
	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getCategoryid() {
		return categoryid;
	}
	@XmlElement
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price
				+ ", description=" + description + ", categoryid=" + categoryid
				+ ", categoryid=" + category.getId() + ", categoryname=" + category.getName() + "]";
	}

	public Product(int id, String name, float price, String description,
			int categoryid, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.categoryid = categoryid;
		this.category = category;
	}
	
	
	
	
	public Product(String name, float price, String description,
			int categoryid, Category category) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.categoryid = categoryid;
		this.category = category;
	}

	public Product() {
	}

	public Product(String name, float price, String description, int categoryid) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.categoryid = categoryid;
	}
	
	
	
	
}
