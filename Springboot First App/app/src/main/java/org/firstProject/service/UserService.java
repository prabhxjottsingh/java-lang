package org.firstProject.service;

import org.firstProject.bean.UserConfig;

public class UserService {
    UserConfig userConfig;

    public UserService() {
    
    }

    public UserService(UserConfig userConfig) {
        this.userConfig = userConfig;
    }

    public void setUserConfig(UserConfig userConfig) {
        this.userConfig = userConfig;
    }

}
