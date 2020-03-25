package cn.wyd.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosController {

    @Value("${server.port}")
    private String serverPost;

    @GetMapping(value = "provider/test")
    public String test() {
        return "provider/test serverPost " + serverPost + " currentTimeMillis " + System.currentTimeMillis();
    }

}
