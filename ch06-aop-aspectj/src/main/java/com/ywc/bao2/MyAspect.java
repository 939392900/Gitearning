package com.ywc.bao2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * 后置通知定义方法 实现切面类功能的
 * 方法定义要求：
 * 1.公共方法 2.方法名称自定义 3.方法没有返回值 4.方法有参数 推荐Object 参数名任意
 * 注解@AfterReturning：后置通知
 * 属性：1.value 切入点表达式  2.returning 自定义的变量 表示目标方法的返回值的 自定义的变量名必须和方法的形参名一样
 * 位置：方法定义上面
 * 特点：
 * 1.在目标方法之后执行的
 * 2.能够获取到目标方法的返回值 可以根据这个返回值做不同的处理功能
 * Object res = doOther()
 * 3.可以修改返回值
 * 后置通知的执行
 * Object res = doOther();  myAspectReturning(res);
 *
 * @author BaiGei
 * @date 2021-03-08 12:46
 */
@Aspect
public class MyAspect {
    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))", returning = "res")
    public void myAfterReturning(JoinPoint jp, Object res) {
        //Object res：是目标方法执行后的返回值 根据返回值做你的切面的功能处理
        System.out.println("方法的签名" + jp.getSignature());
        System.out.println("方法的名称" + jp.getSignature().getName());
        Object[] objects = jp.getArgs();
        for (Object o : objects
        ) {
            System.out.println("方法的参数" + o);

        }
        System.out.println("后置通知：在目标方法之后执行的，获取的返回值是：" + res);
        if (res.equals("abcd")) {
            //做一些功能
        } else {
            //做其他功能
        }
        //修改目标方法的返回值 是否会影响最后方法调用结果
        if (res != null) {
            res = "Hello AspectJ";
        }

    }

}
