package com.muy.conditional;

/**
 * Created by yanglikai on 2016/12/14.
 */
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
