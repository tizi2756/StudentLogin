package com.liu.action;

import com.liu.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
    private UserService userService;
    private String password;
    private String name;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String login(){
        Boolean flag=userService.login(name, password);
        if(flag){
            return "loginSuccess";
        }else{
            return "loginFalse";
        }
    }
}
