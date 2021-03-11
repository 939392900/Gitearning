package com.ywc;

import com.ywc.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author BaiGei
 * @date 2021-03-09 16:32
 */
public class MyTest {
    @Test
    public void test() {
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        BuyGoodsService buyGoodsService = (BuyGoodsService) applicationContext.getBean("buyGoodsService");
        System.out.println("service是代理" + buyGoodsService.getClass().getName());
        buyGoodsService.buy(1001, 10);
    }
}
