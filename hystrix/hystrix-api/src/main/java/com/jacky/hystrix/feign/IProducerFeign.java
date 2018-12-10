package com.jacky.hystrix.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient("eureka-producer")
public interface IProducerFeign {

    @GetMapping("/getProducerInfo")
    String getProducerInfo();

    @GetMapping("timeoutReq")
    public String timeoutReq();
}
