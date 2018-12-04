package com.jacky.producer.services;

import com.jacky.producer.feign.IProducerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IProducerImpl implements IProducerFeign {

    @Autowired
    private LoadBalancerClient client;

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/getProducerInfo")
    public String getProducerInfo() {
        ServiceInstance instance = client.choose(applicationName);
        return "Message info from producer of port: " + instance.getPort();
    }
}
