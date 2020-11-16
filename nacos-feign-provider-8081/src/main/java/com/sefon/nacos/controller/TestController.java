package com.sefon.nacos.controller;

import com.sefon.nacos.service.RemoteService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author wenc
 * @description
 * @email 2515106327@qq.com
 * @create 2019-12-16 22:40
 */
@RestController
public class TestController implements RemoteService {
    @Override
    @GetMapping("/helloNacos")
    public String helloNacos(){
        return "你好，nacos！";
    }

    @Override
    @GetMapping("/timeout")
    public String timeOut(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Thread.currentThread().getName()+": time out success";
    }

    @Override
    @GetMapping("/ok")
    public String ok(){
        return Thread.currentThread().getName()+": time ok success";
    }
}
