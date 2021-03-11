package com.ywc.bao1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * 注解@Aspect：是aspectj框架中的注解
 * 作用：表示当前类是切面类       切面类：是用来给业务方法增加功能类 在这个类中有切面功能代码
 * 使用位置是在类定义上面
 * 定义方法 实现切面类功能的
 * 方法定义要求：
 * 1.公共方法 2.方法名称自定义 3.方法没有返回值 4.方法可以有参数也可以没有参数
 * 如果有参数，参数不是自定义的,有几个参数类型可以使用
 * 注解@Before：前置通知    属性value:是切入点表达式,表示切面的功能执行的位置     位置是在方法上面
 * 特点：在目标方法之前先执行 不会改变目标方法的执行结果 不会影响目标方法的执行
 *
 * @author BaiGei
 * @date 2021-03-08 12:46
 */
@Aspect
public class MyAspect {

    //    @Before(value = "execution(public void com.ywc.bao1.SomeServiceImpl.doSome(String,Integer))")
//    public void myBefore() {
//        //就是你实现切面功能的方法
//        System.out.println("前置通知，切面功能：在目标方法之前输出执行时间" + new Date());
//    }


    //    @Before(value = "execution(void com.ywc.bao1.SomeServiceImpl.doSome(String,Integer))")
//    public void myBefore() {
//        //就是你实现切面功能的方法
//        System.out.println("1=============前置通知，切面功能：在目标方法之前输出执行时间" + new Date());
//    }


//    @Before(value = "execution(void *..SomeServiceImpl.doSome(String,Integer))")
//    public void myBefore() {
//        //就是你实现切面功能的方法
//        System.out.println("2=============前置通知，切面功能：在目标方法之前输出执行时间" + new Date());
//    }


//    @Before(value = "execution( * *..SomeServiceImpl.do*(..))")
//    public void myBefore1() {
//        //就是你实现切面功能的方法
//        System.out.println("3=============前置通知，切面功能：在目标方法之前输出执行时间" + new Date());
//    }

//    @Before(value = "execution( * *..do*(..))")
//    public void myBefore2() {
//        //就是你实现切面功能的方法
//        System.out.println("4=============前置通知，切面功能：在目标方法之前输出执行时间" + new Date());
//    }

    //指定通知方法中的参数 JoinPoint
    //JoinPoint:业务方法，要加入切面功能的业务方法
    //作用是：可以在通知方法中获取方法执行时的信息，例如方法名称，参数
    //如果你的切面功能中需要用到 方法信息 就加入JoinPoint
    //使用要求：JoinPoint参数的值是框架赋的 必须是第一个位置的参数
    //


    @Before(value = "execution(void *..SomeServiceImpl.doSome(String,Integer))")
    public void myBefore(JoinPoint jp) {
        //获取方法的完整定义
        System.out.println("方法的签名（定义）" + jp.getSignature());
        System.out.println("方法的名称" + jp.getSignature().getName());
        Object[] objects = jp.getArgs();
        for (Object o : objects
        ) {
            System.out.println("方法的实参" + o);

        }
        //就是你实现切面功能的方法
        System.out.println("2=============前置通知，切面功能：在目标方法之前输出执行时间" + new Date());
    }
}
