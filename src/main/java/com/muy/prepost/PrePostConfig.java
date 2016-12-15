package com.muy.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yanglikai on 2016/12/15.
 */
@Configuration
@ComponentScan("com.muy.prepost")
public class PrePostConfig {

    @Bean(initMethod = "init", destroyMethod = "destory")
    public BeanWayService beanWayService() {
        return new BeanWayService();
    }

}
