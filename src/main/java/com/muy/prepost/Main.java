package com.muy.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 2.3-Bean初始化和销毁
 * Created by yanglikai on 2016/12/15.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);

        BeanWayService beanWayService = context.getBean(BeanWayService.class);

        context.close();
    }
}
