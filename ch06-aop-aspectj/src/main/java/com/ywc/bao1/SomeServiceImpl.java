package com.ywc.bao1;

/**
 * 目标类
 *
 * @author BaiGei
 * @date 2021-03-08 12:43
 */
public class SomeServiceImpl implements SomeService {

    @Override
    public void doSome(String name, Integer age) {
        //给doSome方法增加功能 在doSome()执行之前输出方法的执行时间
        System.out.println("===========目标方法doSome============");

    }


}
