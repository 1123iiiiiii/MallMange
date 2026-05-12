package org.ccit.springboot05_248.mapper;

import org.apache.ibatis.annotations.*;
import org.ccit.springboot05_248.entity.Product;

import java.util.List;

@Mapper
public interface ProductMapper {
    @Select("select * from product1")
    List<Product> select();

    @Select("select * from product1_admin")
    List<Product> selectAdmin();

    // 根据分类ID查询
    @Select("select * from product1 where category_id = #{categoryId}")
    List<Product> selectByCategory(Integer categoryId);

    // 按标题模糊查询
    @Select("select * from product1 where title like concat('%', #{keyword}, '%')")
    //concat()  %关键字% %关键字 关键字%
    List<Product> searchByTitle(String keyword);

    // 根据商品ID查询进详情页
    @Select("select * from product1 where id = #{id}")
    Product selectById(Integer id);

    // 删除商品
    @Delete("delete from product1 where id = #{id}")
    int deleteById(Integer id);

    // 添加商品
    @Insert("insert into product1(title,price,oldPrice,url,saleCount,category_id) values(#{title},#{price},#{oldPrice},#{url},#{saleCount},#{categoryId})")
    int insert(Product product);

    // 更新商品
    @Update("update product1 set title=#{title},price=#{price},oldPrice=#{oldPrice},url=#{url},saleCount=#{saleCount},category_id=#{categoryId} where id=#{id}")
    int update(Product product);

    // 增加浏览量
    @Update("update product1 set view_count = view_count + 1 where id = #{id}")
    int incrementViewCount(Integer id);

}
