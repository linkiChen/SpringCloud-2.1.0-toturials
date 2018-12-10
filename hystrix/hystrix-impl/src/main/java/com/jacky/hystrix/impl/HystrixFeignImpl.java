package com.jacky.hystrix.impl;

import com.jacky.hystrix.feign.HystrixFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hystrix")
public class HystrixFeignImpl {

    @Autowired
    HystrixFeign hystrixFeign;

    @GetMapping("getProducerInfo")
    public String getProducerInfo() {
        return hystrixFeign.getProducerInfo();
    }

    @GetMapping("timeoutReq")
    public String timeoutRequest() {
        return hystrixFeign.timeoutReq();
    }
}
