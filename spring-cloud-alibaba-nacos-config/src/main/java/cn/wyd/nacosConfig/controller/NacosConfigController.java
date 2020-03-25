package cn.wyd.nacosConfig.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RefreshScope 自动刷新配置中心配置
 * 加入到启动类上，并不会全局刷新配置，只能作用域单个类上，一般放到controller上
 */
@RefreshScope
@RestController
public class NacosConfigController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("test")
    public String test(){
        return configInfo;
    }
}
