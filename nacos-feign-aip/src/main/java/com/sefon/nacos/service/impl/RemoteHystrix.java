package com.sefon.nacos.service.impl;

import com.sefon.nacos.service.RemoteClient;
import org.springframework.stereotype.Component;

/**
 * @author wenc
 * @description 当提供者 服务器挂掉之后执行
 * @email 2515106327@qq.com
 * @create 2019-12-16 22:31
 */
@Component
public class RemoteHystrix implements RemoteClient {
    @Override
    public String helloNacos() {
        return "请求超时了";
    }
}
