package com.muy.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by yanglikai on 2016/12/14.
 */
@Configuration
@ComponentScan(value = "com.muy.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
