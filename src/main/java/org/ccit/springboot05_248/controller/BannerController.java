package org.ccit.springboot05_248.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.ccit.springboot05_248.entity.Banner;
import org.ccit.springboot05_248.mapper.BannerMapper;

import java.util.List;

@RestController
public class BannerController {
    @Autowired
    private BannerMapper mapper;
    @RequestMapping("/banner/select")
    public List<Banner> selectBanner(){
        return mapper.selectBanner();
    }

    // 添加轮播图接口
// 添加轮播图接口
    @RequestMapping("/banner/add")
    public int add(@RequestParam String url, @RequestParam Integer categoryId){
        System.out.println("=== Banner Add Debug ===");
        System.out.println("url: " + url);
        System.out.println("categoryId: " + categoryId);

        Banner banner = new Banner();
        banner.setUrl(url);
        banner.setCategoryId(categoryId);

        try {
            int result = mapper.insert(banner);
            System.out.println("Insert result: " + result);
            return result;
        } catch (Exception e) {
            System.err.println("Insert error: " + e.getMessage());
            e.printStackTrace();
            return 0;
        }
    }

    //  删除轮播图接口
    @RequestMapping("/banner/delete")
    public int delete(Integer id){
        return mapper.deleteById(id);
    }

}
