package com.ywc.bao6;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author BaiGei
 * @date 2021-03-07 14:41
 */
@Component("myStudent")
public class Student {
    //引用类型 @Resource:来自JDK spring提供了对这个注解的支持 可以使用它给引用类型赋值
    //使用的也是自动注入的原理 支持byName和byType 默认是byName 如果byName赋值失败 再使用byType
    //使用位置1.在属性上面  无序set 2. 在set上面


    @Resource
    private School school;
    private Integer age;
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
