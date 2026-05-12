package org.ccit.springboot05_248.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ccit.springboot05_248.entity.Top;
import org.ccit.springboot05_248.mapper.TopMapper;

import java.util.List;

@RestController
public class TopController {
    @Autowired
    private TopMapper topMapper;

    @RequestMapping("/top/select")
    public List<Top> select(){
        return topMapper.select();
    }


}
