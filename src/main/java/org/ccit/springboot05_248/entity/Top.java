package org.ccit.springboot05_248.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor //无参构造方法
@AllArgsConstructor //全参构造方法
@Data //get/set/toString
public class Top {
    private Integer id;
    private String title;
    private int saleCount;
    private Integer productId;  // 关联的商品ID
}
