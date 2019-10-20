package com.jacken;

import com.jacken.service.UserService;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * invoker :interface com.jacken.service.UserService ->
 * zookeeper://127.0.0.1:2181/org.apache.dubbo.registry.RegistryService?anyhost=true&application=dubbo-consumer
 * &bean.name=com.jacken.service.UserService&check=false&deprecated=false
 * &dubbo=2.0.2&dynamic=true&generic=false&interface=com.jacken.service.UserService
 * &lazy=false&methods=findOne&pid=2088&register=true&register.ip=192.168.65.1
 * &release=2.7.3&remote.application=dubbo-provider&side=consumer&sticky=false
 * &timestamp=1571555495729,directory: org.apache.dubbo.registry.integration.RegistryDirectory@315df4bb
 *
 * consumer 从注册中心获取bean 并生成他的代理类
 *
 * dubbo  基于springboot 实现微服务之间的远程调用
 */


@SpringBootApplication
@EnableDubbo
public class DubboConsumerApplication {
    public static void main(String[] args) throws Exception {

//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext(new String[]{"classpath:consumer.xml"});
//        UserService service = context.getBean(UserService.class);
//        System.out.println("get provider user is :"+service.findOne());
//        System.in.read(); //按任意键退出
        SpringApplication.run(DubboConsumerApplication.class);
    }

}
