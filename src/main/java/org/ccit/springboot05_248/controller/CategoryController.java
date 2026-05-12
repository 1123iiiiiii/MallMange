package org.ccit.springboot05_248.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ccit.springboot05_248.entity.Category;
import org.ccit.springboot05_248.mapper.CategoryMapper;

import java.util.List;

@RestController
public class CategoryController {
  @Autowired
  private CategoryMapper mapper;

  @RequestMapping("/category/select")
    public List<Category> select(){
    return mapper.select();
  }

  // 添加分类
  @RequestMapping("/category/add")
  public int add(@RequestBody Category category){
    return mapper.insert(category);
  }

  // 删除分类
  @RequestMapping("/category/delete")
  public int delete(Integer id){
    return mapper.deleteById(id);
  }

  // 修改分类
  @RequestMapping("/category/update")
  public int update(@RequestBody Category category){
    return mapper.update(category);
  }
}
