package org.ccit.springboot05_248.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.ccit.springboot05_248.entity.Banner;

import java.util.List;

@Mapper
public interface BannerMapper {
    @Select("select * from banner")
    List<Banner> selectBanner();

    // 添加轮播图
    @Insert("insert into banner(url, category_id) values(#{url}, #{categoryId})")
    int insert(Banner banner);

    // 删除轮播图
    @Delete("delete from banner where id = #{id}")
    int deleteById(Integer id);

}
