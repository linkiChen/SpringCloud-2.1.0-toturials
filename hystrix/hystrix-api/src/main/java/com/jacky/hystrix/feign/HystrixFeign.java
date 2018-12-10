package com.jacky.hystrix.feign;

import com.jacky.hystrix.fallback.HystrixFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-producer", fallback = HystrixFeignFallback.class)
public interface HystrixFeign {

    @GetMapping("/getProducerInfo")
    String getProducerInfo();

    @GetMapping("timeoutReq")
    public String timeoutReq();
}
