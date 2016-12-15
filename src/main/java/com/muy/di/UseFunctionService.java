package com.muy.di;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yanglikai on 2016/12/14.
 */
@Service
public class UseFunctionService {
    @Resource
    private FunctionService functionService;

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
