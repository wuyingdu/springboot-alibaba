package cn.wyd.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("provider")
public class TestController {

    @Value("${server.port}")
    private String serverPost;

    @GetMapping(value = "test")
    public String test() {
        return "Hello Nacos Discovery Server Post " + serverPost +" currentTimeMillis "+ System.currentTimeMillis();
    }

}
