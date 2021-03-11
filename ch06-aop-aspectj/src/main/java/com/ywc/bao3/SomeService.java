package com.ywc.bao3;

/**
 * @author BaiGei
 * @date 2021-03-08 12:27
 */
public interface SomeService {
    /**
     * doSome
     *
     * @param name name
     * @param age  age
     */
    void doSome(String name, Integer age);

    /**
     * doOther
     *
     * @param name name
     * @param age  age
     * @return return
     */
    String doOther(String name, Integer age);

    /**
     * doFirst
     *
     * @param name name
     * @param age  age
     * @return return
     */
    String doFirst(String name, Integer age);

}
