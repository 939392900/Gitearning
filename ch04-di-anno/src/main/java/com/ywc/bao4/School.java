package com.ywc.bao4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author BaiGei
 * @date 2021-03-06 15:47
 */
@Component("mySchool")
public class School {
    @Value("人民大学")
    private String name;
    @Value("北京海淀区")
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
