package com.muy.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yanglikai on 2016/12/14.
 */
@Configuration
public class ConditionConfig {
    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService() {
        return new LinuxListService();
    }
}
