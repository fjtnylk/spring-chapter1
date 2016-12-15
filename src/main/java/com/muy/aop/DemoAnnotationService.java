package com.muy.aop;

import org.springframework.stereotype.Service;

/**
 * Created by yanglikai on 2016/12/14.
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作!")
    public void add() {
    }
}
