package com.ywc.bao3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 简单类型属性赋值 @value 属性 value:是String类型的 表示简单类型的属性值
 * 位置:  1.在属性定义上面,无序set方法,推荐 2.在set方法上面
 *
 * @author BaiGei
 * @date 2021-03-07 14:41
 */
@Component("myStudent")
public class Student {
    //引用类型 @Autowired:spring框架提供的注解实现引用类型的赋值
    //spring中通过注解给引用类型赋值 使用的是自动注入的原理 Autowired默认使用的byType自动注入
    //1.在属性定义的上面 无需set方法 直接使用
    //2.在set方法上面

    @Autowired
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
