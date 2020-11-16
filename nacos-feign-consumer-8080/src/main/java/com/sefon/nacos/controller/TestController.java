package com.sefon.nacos.controller;

import com.sefon.nacos.controller.thirdapi.RemoteServiceClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wenc
 * @description
 * @email 2515106327@qq.com
 * @create 2019-12-16 23:19
 */
@RestController
public class TestController {
    @Resource
    private RemoteServiceClient remoteClient;

    @GetMapping("/helloFeign")
    public String test() {
        return remoteClient.helloNacos();

    }
    @GetMapping("/timeout")
    public String timeOut() {
        return remoteClient.timeOut();
    }

    @GetMapping("/ok")
    public String ok() {
        return remoteClient.ok();
    }
}
