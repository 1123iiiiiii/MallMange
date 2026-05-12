package org.ccit.springboot05_248.mapper;

import org.apache.ibatis.annotations.*;
import org.ccit.springboot05_248.entity.Category;

import java.util.List;
@Mapper
public interface CategoryMapper {
    @Select("select * from category")
    List <Category> select();

    @Select("select * from category_admin")
    List <Category> selectAdmin();

    // 添加分类(并同步数据库)
    @Insert("insert into category(name) values(#{name})")
    int insert(Category category);

    // 删除分类(并同步数据库)
    @Delete("delete from category where id = #{id}")
    int deleteById(Integer id);

    // 修改分类
    @Update("update category set name = #{name} where id = #{id}")
    int update(Category category);
}
