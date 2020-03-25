package cn.wyd.anacoSconsumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class NacosConsumerController {


    @Resource
    private RestTemplate restTemplate;

    public static final String serverName = "http://nacos-provider";

    @GetMapping("consumer/test")
    public String test(){
        return restTemplate.getForObject(serverName+"/provider/test", String.class);
    }




}
