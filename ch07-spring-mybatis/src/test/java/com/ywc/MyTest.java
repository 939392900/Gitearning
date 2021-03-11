package com.ywc;

import com.ywc.dao.StudentDao;
import com.ywc.domain.Student;
import com.ywc.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author BaiGei
 * @date 2021-03-08 19:23
 */
public class MyTest {
    @Test
    public void test() {
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String n : names
        ) {
//            System.out.println("容器中对象名称"+applicationContext.getBean(n).getClass().getName());
            System.out.println("容器中对象名称" + n);
        }
    }

    @Test
    public void test1() {
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //获取spring中的dao对象
        StudentDao dao = (StudentDao) applicationContext.getBean("studentDao");
        Student student = new Student();
        student.setId(1009);
        student.setName("白起");
        student.setEmail("baiqi@qq.com");
        student.setAge(35);
        int num = dao.insertStudent(student);
        System.out.println("num = " + num);
    }

    @Test
    public void test2() {
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        Student student = new Student();
        student.setId(1010);
        student.setName("韩信");
        student.setEmail("baiqi@qq.com");
        student.setAge(25);
        int num = studentService.addStudent(student);
//       //spring和mybatis整合在一起使用 事务是自动提交的 无需执行sqlSession.commit();
        System.out.println("num =" + num);
    }

    @Test
    public void test3() {
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        List<Student> students = studentService.queryStudent();
        for (Student s : students
        ) {
            System.out.println(s);
        }
    }
}
