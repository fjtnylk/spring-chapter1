package com.muy.prepost;

/**
 * Created by yanglikai on 2016/12/15.
 */
public class BeanWayService {
    public void init() {
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destory() {
        System.out.println("@Bean-destory-method");
    }
}
