package com.sefon.nacos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenc
 * @description
 * @email 2515106327@qq.com
 * @create 2019-12-16 22:40
 */
@RestController
public class TestController {
    @GetMapping("/helloNacos")
    public String helloNacos(){
        return "你好，nacos！";
    }
}
