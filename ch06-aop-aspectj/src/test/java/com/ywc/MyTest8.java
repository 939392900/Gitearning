package com.ywc;

import com.ywc.bao8.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author BaiGei
 * @date 2021-03-08 13:03
 */
public class MyTest8 {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SomeService someService = (SomeService) applicationContext.getBean("someService");
        System.out.println("someService" + someService.getClass().getName());
        someService.doThird();

    }
}
