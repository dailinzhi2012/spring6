package com.atguigu.spring6.bean.autowired.controller;

import com.atguigu.spring6.bean.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    // 注入userService
    //第一种方式 属性注入
//    @Autowired  //根据类型找到对应对象，完成注入
//    private UserService userService;

    //    //第二种方式 setter方法注入
//    private UserService userService;
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }
    //第三种方式构造器注入
//    private UserService userService;
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
    //第四种方式 形参注入
//    private UserService userService;
//    public UserController(@Autowired UserService userService) {
//        this.userService = userService;
//    }
    //第五种方式  只有一个有参数构造，无注解
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void add() {
        System.out.println("controller add ");
        userService.add();
    }
}
