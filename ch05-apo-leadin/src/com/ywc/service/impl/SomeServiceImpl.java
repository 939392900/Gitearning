package com.ywc.service.impl;

import com.ywc.service.SomeService;
import com.ywc.util.ServiceTools;

import java.util.Date;

/**
 * @author BaiGei
 * @date 2021-03-07 17:04
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("执行业务方法doSome");

    }

    @Override
    public void doOther() {
        System.out.println("执行业务方法doOther");

    }
}
