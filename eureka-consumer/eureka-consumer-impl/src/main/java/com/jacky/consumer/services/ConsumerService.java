package com.jacky.consumer.services;

import com.jacky.consumer.feign.producer.IProducerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerService {

    @Autowired
    IProducerFeign producerFeign;

    @GetMapping("producerInfo")
    public String producerInfo() {
        return producerFeign.getProducerInfo();
    }
}
