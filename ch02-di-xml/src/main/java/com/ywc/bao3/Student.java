package com.ywc.bao3;

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

    public Student() {
        System.out.println("spring会调用类的无参构造方法创建对象");
    }

    public Student(String myName, int myAge, School mySchool) {
        System.out.println("student类有参数构造方法");
        this.name = myName;
        this.age = myAge;
        this.school = mySchool;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
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
