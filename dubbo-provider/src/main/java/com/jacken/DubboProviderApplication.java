package com.jacken;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication

/**
 * dubbo 不支持分布式事务
 */
@SpringBootApplication
@EnableDubbo
public class DubboProviderApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DubboProviderApplication.class, args);

//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext(new String[]{"classpath:provider.xml"});
//        context.start();
//        System.in.read(); //按任意键退出
    }

}
