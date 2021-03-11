package com.ywc.bao5;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * 最终通知定义方法 实现切面类功能的
 * 方法定义要求：
 * 1.公共方法 2.方法名称自定义 3.方法无返回值  4.方法没有参数 有就是JoinPoint
 * 注解    @After()
 * 属性 value：切入点表达式
 * 位置：方法之上
 * 特点：
 * 1.总是会执行
 * 2.在目标方法之后执行
 * try{
 *     SomeService.doThird();
 * }catch(Exception e){
 *
 * }finally{
 *     myAfter();
 * }
 * @author BaiGei
 * @date 2021-03-08 12:46
 */
@Aspect
public class MyAspect {
    @After(value = "execution(* *..SomeServiceImpl.doThird(..))")
    public void myAfter() {
        System.out.println("执行最终通知，总是会被执行");
        //一般做资源清除工作


    }
}
