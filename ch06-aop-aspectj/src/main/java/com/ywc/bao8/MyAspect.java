package com.ywc.bao8;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 最终通知定义方法 实现切面类功能的
 * 方法定义要求：
 * 1.公共方法 2.方法名称自定义 3.方法无返回值  4.方法没有参数 有就是JoinPoint
 *
 * @author BaiGei
 * @date 2021-03-08 12:46
 */
@Aspect
public class MyAspect {
    @After(value = "mypt()")
    public void myAfter() {
        System.out.println("执行最终通知，总是会被执行");
        //一般做资源清除工作
    }

    @Before(value = "mypt()")
    public void myBefore() {
        System.out.println("前置通知，在目标方法之前执行");
        //一般做资源清除工作
    }

    /**
     * 注解@Pointcut 定义和管理切入点 如果项目中有多个切入点 表达式是重复的可以复用的 可以使用该注解
     * 属性：value 切入点表达式
     * 位置 在自定义的方法上面
     * 特点：
     * 当使用@Pointcut定义在一个方法的上面，此时这个方法的名称就是切入点表达式的别名
     * 其他通知中，value属性就可以使用这个方法的别名 代替切入点表达式
     */
    @Pointcut(value = "execution(* *..SomeServiceImpl.doThird(..))")
    public void mypt() {
        //无需代码
    }

}