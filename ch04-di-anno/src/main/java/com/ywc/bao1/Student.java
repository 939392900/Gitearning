package com.ywc.bao1;


import org.springframework.stereotype.Component;

/**
 * Component 创建对象的  等同于<bean> 属性value 就是对象的名称 也就是bean的id value的值是唯一的
 * 使用value属性指定对象名称 可以省略valueComponent("myStudent")
 * 创建的对象在整个spring容器中就一个     位置：在类的上面
 * Component(value = "myStudent") 等同于<bean id="myStudent" class="com.ywc.bao1.Student">
 * 不指定对象名称 由spring提供默认名称@Component  默认名称是类名的首字母小写
 * spring中和@Component功能一致 创建对象的注解还有：
 * 1.@Repository（用在持久层类的上面）:放在dao的实现类上面，表示创建dao对象，dao对象是能访问数据库的
 * 2.@Service（用在业务层类的上面）:放在Service的实现类上面，创建Service对象，Service对象是做业务处理 可以有事务等功能
 * 3.@Conntroller(用在控制器上面)：放在控制器（处理器）类的上面，创建控制器对象的 控制器对象，能够接收用户提交的参数，显示请求的处理结果
 * 以上三个注解的使用语法和@Component一样的，都能创建对象，但是这三个注解还有额外的功能 这三个是给项目的对象分层的
 *
 *
 * @author BaiGei
 * @date 2021-03-07 14:41
 */
@Component("myStudent")
public class Student {
    private Integer age;
    private String name;

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
