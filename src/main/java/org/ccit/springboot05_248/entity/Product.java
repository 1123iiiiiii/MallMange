package org.ccit.springboot05_248.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor //无参构造方法
@AllArgsConstructor //全参构造方法
@Data //get/set/toString
public class Product {
    private Integer id;
    private String title;
    private Double price;
    private Double oldPrice;
    private String url;
    private Integer saleCount;
    private Integer categoryId;  //分类ID
    private Integer viewCount;  // 浏览量
}
