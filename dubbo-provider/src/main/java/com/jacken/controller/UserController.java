package com.jacken.controller;



import com.jacken.domain.User;
import com.jacken.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private UserServiceImpl userService;
    public User findOne(){
     return    userService.findOne();
    }
}
