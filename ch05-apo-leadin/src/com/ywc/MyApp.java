package com.ywc;

import com.ywc.handler.MyInvocationHandler;
import com.ywc.service.SomeService;
import com.ywc.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author BaiGei
 * @date 2021-03-07 17:05
 */
public class MyApp {
    public static void main(String[] args) {
        //调用doSome doOther
//        SomeService someService = new SomeServiceImpl();
//        someService.doSome();
//        System.out.println("==================");
//        someService.doOther();
// 使用jdk的Proxy创建代理对象

        SomeService target = new SomeServiceImpl();
        //创建InvocationHandler对象
        InvocationHandler handler = new MyInvocationHandler(target);
        //使用Proxy创建代理
        SomeService someService = (SomeService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), handler);
        //通过代理执行方法 会调用handler中的invoke()
        someService.doOther();
        System.out.println("==============");
        someService.doSome();

    }
}
