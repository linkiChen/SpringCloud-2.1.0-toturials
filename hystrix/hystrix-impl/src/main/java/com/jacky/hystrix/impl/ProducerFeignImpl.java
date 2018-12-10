package com.jacky.hystrix.impl;

import com.jacky.hystrix.feign.IProducerFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerFeignImpl {

//    @Autowired
    IProducerFeign producerFeign;

    @GetMapping("getProducerInfo")
    public String getProducerInfo() {
        return producerFeign.getProducerInfo();
    }

    /**
     * 当前端请求timeoutRequest时 producerFeign.timeoutReq()会请求4次，包括第一次请求及超时重试的三次
     * 之后就会服务fast-fail方法timeoutReqFallback
     *
     * @return
     */
    @HystrixCommand(fallbackMethod = "timeoutReqFallback")
    @GetMapping("timeoutReq")
    public String timeoutRequest() {
        return producerFeign.timeoutReq();
    }

    public String timeoutReqFallback() {
        return "Request timeout...";
    }
}
