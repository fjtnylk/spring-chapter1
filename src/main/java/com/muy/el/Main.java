package com.muy.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 2.2-EL表达式
 * Created by yanglikai on 2016/12/14.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);

        ElConfig elConfig = context.getBean(ElConfig.class);

        elConfig.outputResource();

        context.close();
    }
}
