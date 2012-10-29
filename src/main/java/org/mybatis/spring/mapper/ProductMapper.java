package org.mybatis.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.mybatis.spring.model.Product;

public interface ProductMapper {
	
	
	/**
	 * 查询所有的商品
	 * @return
	 */
	@Select("SELECT * FROM product INNER JOIN category ON product.categoryid=category.id")
	@ResultMap("productResultMap")
	List<Product> listAllProduct();
	
	/**
	 * 根据商品类别查询商品
	 * @return
	 */
	@Select("select * from product where categoryid = #{categoryid}")
	@ResultMap("productResultMap")
	List<Product> listProductByCategoryid(@Param("categoryid")int categoryid);
	
	
	
	
	
	
	/**
	 * 动态sql查询
	 * @return
	 */
	List<Product> dynaQuerySql(Product product);
	
	
	
	
	
	/**
	 * 级联查询
	 * @return
	 */
	List<Product> listAllProductIncludeCategoryName();
	
	
	/**
	 * 新增
	 * @param product
	 */
	void insertProduct(Product product);
	
	
	
	
	/**
	 * 修改
	 * @param product
	 */
	@Update("update product set name=#{product.name},price=#{product.price},description=#{product.description},categoryid=#{product.categoryid} where id = #{product.id} ")
	void updateProduct(@Param("product")Product product);
	
	
	
	
	/**
	 * 根据id联合查询 
	 * @param product
	 */
	@Select("select * from product inner join category on product.categoryid=category.id where product.id = #{id}")
	@ResultMap("productResultMap")
	Product findProductById(@Param("id")int id);
	
	
	
	
	/**
	 * 模糊查询
	 * @param name
	 * @return
	 */
	@Select("select * from product inner join category on product.categoryid=category.id where product.name like #{name} ")
	@ResultMap("productResultMap")
	List<Product> like(@Param("name")String name);
	
	
	
	
	
	/**
	 * 分页查询
	 * @param name
	 * @return
	 */
	@Select("select * from product inner join category on product.categoryid=category.id  order by product.id desc  limit #{pageNumber},#{pageSize} ")
	@ResultMap("productResultMap")
	List<Product> page(@Param("pageNumber")int pageNumber,@Param("pageSize")int pageSize);
	
	
	
}
