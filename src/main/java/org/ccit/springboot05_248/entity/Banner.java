package org.ccit.springboot05_248.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Banner {
    private Integer id;

    private String url;

    private Integer categoryId;  // 关联的分类ID

}
