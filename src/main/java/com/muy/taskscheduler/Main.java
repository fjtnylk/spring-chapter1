package com.muy.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 3.3-定时任务
 * Created by yanglikai on 2016/12/14.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }
}
