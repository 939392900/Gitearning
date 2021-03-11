package com.ywc.bao2;


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
    @Value("26")

//    @Value("${myname}")
    private Integer age;
    @Value("张三")

//    @Value("${myage}")
    private String name;

    //    @Value("26")

    public void setAge(Integer age) {
        this.age = age;
    }

    //    @Value("李四")

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
