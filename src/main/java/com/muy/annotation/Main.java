package com.muy.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 3.5-组合注解和元注解
 * Created by yanglikai on 2016/12/14.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        DemoService service = context.getBean(DemoService.class);

        service.outputResutl();

        context.close();
    }
}
