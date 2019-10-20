package com.jacken.service.impl;


import com.jacken.domain.User;
import com.jacken.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Reference //从注册中心中获取
    private  UserService userService;
    @Override
    public User findOne() {
        return userService.findOne();
    }
}
