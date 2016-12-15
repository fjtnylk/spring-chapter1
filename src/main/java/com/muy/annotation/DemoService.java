package com.muy.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by yanglikai on 2016/12/14.
 */
@Service
public class DemoService {
    public void outputResutl() {
        System.out.println("从组合注解配置照样获得的bean");
    }
}
