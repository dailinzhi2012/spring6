package com.atguigu.spring6.iocxml.life;

public class User {
    private String name;
    public User() {
        System.out.println("1.调用无参数构造创建bean对象");
    }

    //初始化方法

    public void initMethod() {
        System.out.println("4.调用指定初始化方法初始化bean对象");
    }
    //销毁的方法
    public void destroyMethod() {
        System.out.println("7.调用指定销毁方法销毁bean对象");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2.调用setName方法给bean对象设置属性值");
        this.name = name;
    }

}
