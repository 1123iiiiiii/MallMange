package org.ccit.springboot05_248.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.ccit.springboot05_248.entity.User;

@Mapper
public interface UserMapper {

    @Select("select * from user where username=#{username}")
    User selectByUsername(String username);

}
