package com.ywc.bao1;

/**
 * @author BaiGei
 * @date 2021-03-06 15:05
 */
public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        System.out.println("stName" + name);
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("setAge" + age);
        this.age = age;
    }

    public void setEmail(String email) {
        System.out.println("setEmail=" + email);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
