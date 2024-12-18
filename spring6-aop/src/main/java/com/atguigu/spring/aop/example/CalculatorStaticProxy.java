package com.atguigu.spring.aop.example;

/**
 * @author Alex
 * @version 1.0
 */
public class CalculatorStaticProxy implements Calculator {

    //被代理目标对象传递过来
    private Calculator calculator;
    public CalculatorStaticProxy(Calculator calculator) {
        this.calculator = calculator;
    }
    @Override
    public int add(int i, int j) {
        //输出日志
        System.out.println("【日志】add方法开始了，参数是：" + i + "和" + j);

        //调用目标方法实现核心业务
        int addResult = calculator.add(i, j);
        //输出日志
        System.out.println("【日志】add方法执行完毕，结果是：" + addResult);
        return addResult;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}
