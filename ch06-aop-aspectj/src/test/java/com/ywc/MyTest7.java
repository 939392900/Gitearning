package com.ywc;

import com.ywc.bao7.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author BaiGei
 * @date 2021-03-08 13:03
 */
public class MyTest7 {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SomeServiceImpl someService = (SomeServiceImpl) applicationContext.getBean("someService");
        // 没接口 用的是cglib代理 spring自动应用cglib
        System.out.println("someService" + someService.getClass().getName());
        someService.doThird();

    }
}
