package com.ywc;

import com.ywc.bao4.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author BaiGei
 * @date 2021-03-06 19:00
 */
public class MyTest3 {
    @Test
    public void test() {
        String config = "bao4/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);

        Student student = (Student) applicationContext.getBean("myStudent");
        System.out.println("student" + student);
    }
}
