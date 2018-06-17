package com.xiang.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * xiang 2018/6/14
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("dubbo-client.xml");
        //得到IHelloService 远程代理对象

        //循环调用,模拟负载均衡  默认使用随机负载
        for (int i=0;i<10;i++){
            IHelloService helloService= (IHelloService) context.getBean("helloService");
            System.out.println(helloService.sayHello("World"));
            Thread.sleep(1000);
        }

    }
}
