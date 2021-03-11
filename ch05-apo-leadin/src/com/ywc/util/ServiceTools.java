package com.ywc.util;

import java.util.Date;

/**
 * @author BaiGei
 * @date 2021-03-07 17:13
 */
public class ServiceTools {
    public static void doLog() {
        System.out.println("非业务方法,方法的执行时间" + new Date());

    }

    public static void doTrans() {
        System.out.println("方法完毕后 提交事务");

    }
}
