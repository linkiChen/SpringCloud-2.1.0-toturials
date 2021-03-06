package com.jacky.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("client")
public class ClientController {

    @Value("${springcloud.version}")
    private String version;

    @GetMapping("getVersion")
    public String getVersion() {
        return version;
    }
}
