package com.atguigu.spring6.iocxml.ditest;

import java.util.Arrays;

public class Emp {

    //对象类型属性：表明员工属于某个部门
    private Dept dept;

    private String ename;
    private Integer age;

    //爱好
    private String[] hobby;

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void work(){
        System.out.println(ename+" emp working..."+age);
        dept.info();
        System.out.println(Arrays.toString(hobby));
    }
}
