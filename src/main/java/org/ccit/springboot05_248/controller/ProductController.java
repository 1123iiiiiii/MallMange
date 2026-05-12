package org.ccit.springboot05_248.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.ccit.springboot05_248.entity.Product;
import org.ccit.springboot05_248.mapper.ProductMapper;

import java.util.List;
import java.util.Map;

@RestController
public class ProductController {
    @Autowired
    private ProductMapper mapper;

    @RequestMapping("/product/select")
    public List<Product> select(){
        return mapper.select();
}
    @RequestMapping("/product_admin/select")
    public List<Product> selectAdmin(){
        return mapper.selectAdmin();
    }

    //根据分类ID查询
    @RequestMapping("/product/selectByCategory")
    public List<Product> selectByCategory(Integer categoryId){
        return mapper.selectByCategory(categoryId);
    }

    // 按名称模糊搜索
    @RequestMapping("/product/search")
    public List<Product> search(String keyword){
        return mapper.searchByTitle(keyword);
    }

    //根据商品id查询以便点击进详情页
    @RequestMapping("/product/selectById")
    public Product selectById(Integer id){
        return mapper.selectById(id);
    }

    // 更新商品浏览量
    @RequestMapping("/product/incrementViewCount")
    public int incrementViewCount(@RequestBody Map<String, Integer> params){
        Integer id = params.get("id");
        return mapper.incrementViewCount(id);
    }

    // 删除商品
    @RequestMapping("/product/delete")
    public int delete(Integer id){
        return mapper.deleteById(id);
    }

    // 添加商品
    @RequestMapping("/product/add")
    public int add(@RequestParam String title,
                   @RequestParam Double price,
                   @RequestParam Double oldPrice,
                   @RequestParam String url,
                   @RequestParam Integer saleCount,
                   @RequestParam Integer categoryId){
        Product product = new Product(null, title, price, oldPrice, url, saleCount, categoryId, 0);
        return mapper.insert(product);
    }

    // 更新商品
    @RequestMapping("/product/update")
    public int update(@RequestParam Integer id,
                      @RequestParam String title,
                      @RequestParam Double price,
                      @RequestParam Double oldPrice,
                      @RequestParam String url,
                      @RequestParam Integer saleCount,
                      @RequestParam Integer categoryId){
        Product product = new Product(id, title, price, oldPrice, url, saleCount, categoryId, 0);
        return mapper.update(product);
    }
}
