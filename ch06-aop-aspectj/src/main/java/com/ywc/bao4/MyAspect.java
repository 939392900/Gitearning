package com.ywc.bao4;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

/**
 * 异常通知定义方法 实现切面类功能的
 * 方法定义要求：
 * 1.公共方法 2.方法名称自定义 3.方法无返回值  4.方法有一个参数Exception 还有就是JoinPoint
 * 注解@AfterThrowing 异常通知
 * 属性：1.value：切入点表达式 2.throwing 自定义变量 表示目标方法抛出的对象 变量名必须和方法名一样
 * 特点：
 * 1.在目标方法抛出异常的时候执行
 * 2.做异常的监控程序 监控目标方法在执行时是否存在异常 如过有可以发送 邮件 或者短信通知
 * 执行的就是
 * try{
 *     SomeService.doSecond();
 * }catch(Exception e){
 *      myAfterThrowing(e);
 * }
 *
 * @author BaiGei
 * @date 2021-03-08 12:46
 */
@Aspect
public class MyAspect {
    @AfterThrowing(value = "execution(* *..SomeServiceImpl.doSecond(..))", throwing = "ex")
    public void myAfterThrowing(Exception ex) {
        System.out.println("异常通知，在方法发生异常时执行"+ex.toString());
        //发送邮件，短信 通知开发人员

    }
}
