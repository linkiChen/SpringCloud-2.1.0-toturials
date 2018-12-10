package com.jacky.hystrix.fallback;

import com.jacky.hystrix.feign.HystrixFeign;
import org.springframework.stereotype.Component;

@Component
public class HystrixFeignFallback implements HystrixFeign {
    @Override
    public String getProducerInfo() {
        return "Hystrix fallback";
    }

    @Override
    public String timeoutReq() {
        return "request timeout hystrix fallback";
    }
}
