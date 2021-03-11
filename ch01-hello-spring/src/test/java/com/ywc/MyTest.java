package com.ywc;

import com.ywc.service.SomeService;
import com.ywc.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author BaiGei
 * @date 2021-03-04 18:08
 */
public class MyTest {
    @Test
    public void test01() {
        SomeServiceImpl someService = new SomeServiceImpl();
        someService.doSome();
    }

    /**
     * spring默认创建对象的时间，再创建spring的容器时，会创建配置文件中的所有对象
     * spring创建对象 默认调用的是无参数构造方法
     */
    @Test
    public void test02() {
        //使用spring容器创建的对象
        //1.指定spring配置文件的名称
        String config = "beans.xml";
        //2.创建表示spring容器的对象，ApplicationContext
        //ApplicationContext就是表示spring容器 通过这个容器对象 就能获取对象
        //ClassPathXmlApplicationContext()表示从类路径中加载spring的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取某个对象 你要调用对象的方法
        //getBean中的值是配置文件bean中的id
        SomeService someService = (SomeService) ac.getBean("someService");
        //使用spring创建好的方法
        someService.doSome();
    }

    /**
     * 获取容器中定义的对象数量和名称
     */
    @Test
    public void test03() {
        String config = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //使用spring提供的方法 获取容器中定义对象的数量
        int num = applicationContext.getBeanDefinitionCount();
        System.out.println("创建对象的数量" + num);
        //容器中每个定义的对象的名称 返回一个数组
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String n : names
        ) {
            System.out.println("对象名称" + n);
        }
    }

    /**
     * 获取一个非自定义的类对象
     */
    @Test
    public void test04() {
        String config = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Date d = (Date) applicationContext.getBean("mydate");
        System.out.println(d);
    }

}
