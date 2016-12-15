package com.muy.di;

import org.springframework.stereotype.Service;

/**
 * Created by yanglikai on 2016/12/14.
 */
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word + " !";
    }
}
