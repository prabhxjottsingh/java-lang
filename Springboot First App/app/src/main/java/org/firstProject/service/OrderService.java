package org.firstProject.service;

import org.firstProject.bean.UserConfig;

public class OrderService {
    public static OrderService createInstance(UserService userService, UserConfig userConfig){
        return new OrderService();
    }


}
