package com.sefon.nacos.service;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wenc
 * @description
 * @email 2515106327@qq.com
 * @create 2019-12-16 22:31
 */
public interface RemoteService {

    @GetMapping("/helloNacos")
    String helloNacos();

    @GetMapping("/timeout")
    String timeOut();

    @GetMapping("/ok")
    String ok();
}
