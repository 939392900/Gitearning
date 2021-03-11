package com.ywc;

import com.ywc.bao1.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author BaiGei
 * @date 2021-03-08 13:03
 */
public class MyTest1 {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SomeService someService = (SomeService) applicationContext.getBean("someService");
        System.out.println("proxy=" + someService.getClass().getName());
        //通过代理对象执行方法  实现目标方法执行时  增强了功能
        someService.doSome("李四", 20);

    }
}
