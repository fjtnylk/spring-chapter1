package com.muy.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 1.2-java配置
 * Created by yanglikai on 2016/12/14.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.sayHello("java config"));

        context.close();
    }
}
