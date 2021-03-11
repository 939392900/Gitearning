package com.ywc.bao5;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author BaiGei
 * @date 2021-03-07 14:41
 */
@Component("myStudent")
public class Student {
    //引用类型 @Autowired:spring框架提供的注解实现引用类型的赋值
    //spring中通过注解给引用类型赋值 使用的是自动注入的原理 Autowired默认使用的byType自动注入
    //属性:required,是一个boolean类型的 默认true  表示引用类型如果赋值失败 程序报错并终止执行
    //  如果是False 引用类型如果赋值失败 程序正常执行  引用类型是null
    //1.在属性定义的上面 无需set方法 直接使用
    //2.在set方法上面
    //如果要使用byName方式,需要做的是如下
    //1.在属性上面加入Autowired
    //2.在属性上面加入@Qualifier(value="bean的id"):表示使用指定名称的bean完成赋值

    @Autowired(required = true)
    @Qualifier("mySchool-1")
    private School school;
    @Value("26")
    private Integer age;
    @Value("张三")
    private String name;

    //  @Value("26")

    public void setAge(Integer age) {
        this.age = age;
    }

    //@Value("李四")

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "school=" + school +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
