package com.ywc;

import com.ywc.bao1.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * @author BaiGei
 * @date 2021-03-04 18:08
 */
public class MyTest {
    @Test
    public void test01() {
        String config = "bao1/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取Student对象
        Student s = (Student) ac.getBean("myStudent");
        System.out.println("Student对象" + s);


    }


}
