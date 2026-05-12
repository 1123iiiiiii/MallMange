package org.ccit.springboot05_248.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor //无参构造方法
@AllArgsConstructor //全参构造方法
@Data //get/set/toString
public class Category {
    private Integer id;
    private String name;
}
