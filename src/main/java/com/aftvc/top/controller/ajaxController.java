package com.aftvc.top.controller;

import com.aftvc.top.pojo.User;
import com.aftvc.top.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：Yan
 * @ Date       ：Created in 10:51 2020/4/20
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
@RestController
@RequestMapping("/ajax")
public class ajaxController {
    @Autowired
    UserServiceImpl userService;
    @RequestMapping("/getName")
    @ResponseBody
    public String getUsername(String username){
        String msg="";
        User user = userService.FindoneByName(username);
        if (user!=null){
            msg="用户名已存在!";
            return msg;
        }else if(username==""){
            msg="用户名不能为空!";
            return msg;
        }
        else{
            msg="用户名可以使用!";
            return  msg;
        }
    }
}
