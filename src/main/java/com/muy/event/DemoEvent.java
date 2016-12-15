package com.muy.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by yanglikai on 2016/12/14.
 */
public class DemoEvent extends ApplicationEvent{
    private String msg;

    public DemoEvent(Object source) {
        super(source);
    }

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
