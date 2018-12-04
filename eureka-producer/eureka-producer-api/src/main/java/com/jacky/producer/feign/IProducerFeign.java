package com.jacky.producer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "${spring.application.name}")
public interface IProducerFeign {

    @GetMapping("/getProducerInfo")
    String getProducerInfo();
}
