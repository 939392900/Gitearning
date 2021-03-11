package com.ywc.bao7;


import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author BaiGei
 * @date 2021-03-07 14:41
 */
@Component("myStudent")
public class Student {
    //@Resource 只使用byName方式 需要增加一个属性 name name的值是bean的id

    @Resource(name = "mySchool")
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
