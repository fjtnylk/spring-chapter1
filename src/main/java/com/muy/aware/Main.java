package com.muy.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 3.1-Spring Aware
 * Created by yanglikai on 2016/12/14.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);

        AwareService awareService = context.getBean(AwareService.class);

        awareService.outputResult();

        context.close();
    }
}
