package com.jovi.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jovi.services.DemoService;

/**
 * Created by joyce on 2018/3/19
 */
@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello," + name + " . Welcome!";
    }
}
