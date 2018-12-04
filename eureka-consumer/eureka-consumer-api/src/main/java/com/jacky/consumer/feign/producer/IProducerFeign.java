package com.jacky.consumer.feign.producer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "${producer.application.name}")
public interface IProducerFeign {

    @GetMapping("/getProducerInfo")
    String getProducerInfo();
}
