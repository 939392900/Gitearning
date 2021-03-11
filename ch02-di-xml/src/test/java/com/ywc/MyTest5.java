package com.ywc;

import com.ywc.bao6.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author BaiGei
 * @date 2021-03-06 19:18
 */
public class MyTest5 {
    @Test
    public void test() {
        String config = "bao6/total.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Student student = (Student) applicationContext.getBean("myStudent");
        System.out.println("student" + student);
    }
}
