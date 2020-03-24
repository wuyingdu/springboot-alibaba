# 学习springCloudAlibaba新特性demo

## 参考文档  https://spring-cloud-alibaba-group.github.io/github-pages/greenwich/spring-cloud-alibaba.html
## 学习视频 https://www.bilibili.com/video/BV18E411x7eT

## 版本介绍 
1. jdk 1.8
2. springboot 2.2.5.RELEASE
3. springCloud Hoxton.SR3
4. springCloudAlibaba 2.2.0.RELEASE

## 模块介绍
 1. springboot-alibaba 父模块，版本控制
 2. spring-boot-double-base 公共模块，存放Bean和工具类
 3. spring-boot-double-consumer 使用nacos做服务发现，使用double进行服务调用，服务消费者 （非springCloud版本）
 4. spring-boot-double-provider 使用nacos做服务发现，使用double进行服务调用，服务提供者 （非springCloud版本）
 5. spring-cloud-alibaba-nacos nacos做服务发现，测试注册中心和负载均衡