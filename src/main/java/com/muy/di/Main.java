package com.muy.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 1.1-依赖注入
 * Created by yanglikai on 2016/12/14.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);

        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.sayHello("di"));

        context.close();
    }
}
