package com.sefon.nacos.controller.thirdapi;

import com.sefon.nacos.service.RemoteService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author wencheng
 * @create 2020/11/12 20:43
 */
@FeignClient(name = "nacos-provider")
public interface RemoteServiceClient extends RemoteService {

}
