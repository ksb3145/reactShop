package com.myshop.react1.controller;

import com.myshop.react1.servise.UserService;
import com.myshop.react1.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired private UserService userService;

    @PostMapping(value="/testData")
    public UserVO testData(@RequestBody UserVO params){

        System.out.println(params);

        return userService.selectUserOne(params);
    }

}
