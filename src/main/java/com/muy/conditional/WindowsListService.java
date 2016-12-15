package com.muy.conditional;

/**
 * Created by yanglikai on 2016/12/14.
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
