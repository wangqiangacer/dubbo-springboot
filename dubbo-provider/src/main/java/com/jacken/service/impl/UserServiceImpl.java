package com.jacken.service.impl;

import com.jacken.domain.User;
import com.jacken.service.UserService;
import org.springframework.stereotype.Service;


@Service
@org.apache.dubbo.config.annotation.Service  //把此接口注册到注册中心上去
public class UserServiceImpl implements UserService {
    @Override
    public User findOne() {
        User user = new User();
        user.setId("1");
        user.setName("xiaoming6666");
        return user;
    }
}
