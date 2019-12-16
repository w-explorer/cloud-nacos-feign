package com.sefon.nacos.controller;

import com.sefon.nacos.service.RemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenc
 * @description
 * @email 2515106327@qq.com
 * @create 2019-12-16 23:19
 */
@RestController
public class TestController {
    @SuppressWarnings("all")
    @Autowired
    private RemoteClient remoteClient;

    @GetMapping("/helloFeign")
    public String test() {
        return remoteClient.helloNacos();
    }
}
