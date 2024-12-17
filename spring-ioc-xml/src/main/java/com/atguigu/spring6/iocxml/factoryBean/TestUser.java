package com.atguigu.spring6.iocxml.factoryBean;

import com.atguigu.spring6.iocxml.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ApplicationContext   context = new ClassPathXmlApplicationContext("bean-factoryBean.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);

    }
}
