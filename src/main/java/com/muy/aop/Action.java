package com.muy.aop;

import java.lang.annotation.*;

/**
 * Created by yanglikai on 2016/12/14.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
