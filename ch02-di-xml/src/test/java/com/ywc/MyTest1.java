package com.ywc;

import com.ywc.bao2.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author BaiGei
 * @date 2021-03-06 15:50
 */
public class MyTest1 {
    @Test
    public void test01() {
        String config = "bao2/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //从容器中获取Student对象
            Student s = (Student) applicationContext.getBean("myStudent");
        System.out.println("Student对象" + s);
    }
}
