package com.ywc.bao3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

/**
 * 环绕通知定义方法 实现切面类功能的
 * 环绕通知经常做事务：在目标开启之前开启事务，执行目标方法 在目标方法之后提交事务
 * 方法定义要求：
 * 1.公共方法 2.方法名称自定义 3.方法有返回值 推荐Object 4.方法固定参数参数 ProceedingJoinPoint
 * 注解@Around 环绕通知
 * 属性：value：切入点表达式
 * 位置 方法定义上面
 * 特点：
 * 1.它是功能最强的通知
 * 2.可以在目标方法的前后都可以加功能
 * 3.可以控制目标方法是否被调用执行
 * 4.能够修改原来的目标方法的执行结果 影响最后的调用结果
 * 环绕通知等同于JDK动态代理的InvocationHandler接口
 * 参数：ProceedingJoinPoint 就等同于jdk动态代理中的Method 作用：执行目标方法
 * 返回值 ：目标方法的执行结果返回值 可以被修改
 *
 * @author BaiGei
 * @date 2021-03-08 12:46
 */
@Aspect
public class MyAspect {
    @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {

        //获取第一个参数值
        String name = "";
        Object[] args = pjp.getArgs();
        if (args != null && args.length > 1) {
            Object arg = args[0];
            name = (String) arg;
        }

        //实现环绕通知功能
        Object res = null;
        System.out.println("环绕通知：在目标方法之前，输出时间" + new Date());
        //1.实现目标方法的调用 method.invoke()
        if ("王五".equals(name)) {
            res = pjp.proceed();
        }
        System.out.println("环绕通知：在目标方法之后，提交事务");
        //2.在目标方法的前或者后加功能
        //修改目标方法的执行结果 影响方法的最后调用结果
        if (res != null) {
            res = "Hello AspectJ AOP";
        }

        //返回目标方法的执行结果
        return res;
    }

}
