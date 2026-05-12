package org.ccit.springboot05_248.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.ccit.springboot05_248.entity.Top;

import java.util.List;
@Mapper
public interface TopMapper {
    @Select("select * from top order by saleCount desc")
    List<Top> select();
}
