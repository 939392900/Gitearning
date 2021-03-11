package com.ywc.bao6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author BaiGei
 * @date 2021-03-06 15:47
 */
@Component("mySchool")
public class School {
    @Value("西安航空航天大学")
    private String name;
    @Value("西安市莲湖区")
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
