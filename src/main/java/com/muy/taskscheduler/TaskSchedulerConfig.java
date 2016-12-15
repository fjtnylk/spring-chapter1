package com.muy.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by yanglikai on 2016/12/14.
 */
@Configuration
@ComponentScan(value = "com.muy.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
