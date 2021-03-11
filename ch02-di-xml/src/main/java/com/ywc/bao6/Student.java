package com.ywc.bao6;

/**
 * @author BaiGei
 * @date 2021-03-06 15:05
 */
public class Student {

    /**
     * 声明一个引用类型
     */
    private School school;


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

    public void setSchool(School school) {
        System.out.println("setSchool" + school);
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "school=" + school +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
