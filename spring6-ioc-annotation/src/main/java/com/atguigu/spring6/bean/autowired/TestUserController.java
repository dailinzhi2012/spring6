package com.atguigu.spring6.bean.autowired;

import com.atguigu.spring6.bean.autowired.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserController {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        UserController controller = context.getBean(UserController.class);
        controller.add();
    }
}
