package com.ywc.handler;

import com.ywc.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author BaiGei
 * @date 2021-03-07 17:23
 */
public class MyInvocationHandler implements InvocationHandler {
    /**
     * 目标对象
     */
    private final Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行了MyInvocationHandler中的invoke");
        System.out.println("method的名称:" + method.getName());
        String methodName = method.getName();
        Object res = null;
        String a = "doSome";
        if (a.equals(methodName)) {
            //通过代理对象执行方法时会调用执行invoke()
            ServiceTools.doLog();
            //执行目标类的方法 执行Method类实现
            //SomeServiceImpl.doOther().doOther()
            method.invoke(target, args);
            ServiceTools.doTrans();
        }else {
            res = method.invoke(target,args);
        }


        //目标方法执行结果
        return res;
    }
}
