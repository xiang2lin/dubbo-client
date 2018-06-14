package com.xiang.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * xiang 2018/6/14
 **/
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("dubbo-client.xml");
        //得到IHelloService 远程代理对象
        IHelloService helloService= (IHelloService) context.getBean("helloService");
        System.out.println(helloService.sayHello("World"));
    }
}
