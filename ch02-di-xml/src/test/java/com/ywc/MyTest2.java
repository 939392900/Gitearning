package com.ywc;

import com.ywc.bao3.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * @author BaiGei
 * @date 2021-03-06 17:03
 */
public class MyTest2 {
    @Test
    public void test() {
        String config = "bao3/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Student student = (Student) applicationContext.getBean("myStudent2");
        System.out.println("student=" + student);


        File file = (File) applicationContext.getBean("myFile");
        System.out.println("myFile" + file.getName());
    }

}
