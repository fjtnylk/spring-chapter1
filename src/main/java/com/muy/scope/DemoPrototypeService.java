package com.muy.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by yanglikai on 2016/12/14.
 */
@Service
@Scope(value = "prototype")
public class DemoPrototypeService {
}
