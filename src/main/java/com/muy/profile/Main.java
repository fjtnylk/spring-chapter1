package com.muy.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 2.4-Profile
 * Created by yanglikai on 2016/12/15.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.register(ProfileConfig.class);
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();
    }
}
