package com.aftvc.top.controller;

import com.aftvc.top.pojo.User;
import com.aftvc.top.service.Impl.UserServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ Author     ：Yan
 * @ Date       ：Created in 15:39 2020/4/14
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
@Controller
public class UserController {
    @Autowired
    UserServiceImpl userService;
    //获得所有人信息
    @RequestMapping("/emp/list")
    public String getAllUsers(Model model){
        List<User> allUsers = userService.getAllUsers();
        model.addAttribute("allUsers",allUsers);
        return "pages/samples/listUser";
    }
    //跳转登录页面
    @RequestMapping({"/","/tologin"})
    public String toLogin(){
        return "login";
    }
    //登录
    @RequestMapping("/login")
    public String login(@Param("username") String username, @Param("password") String password, HttpSession session,Model model){
        User user = userService.login(username, password);
        if(user!=null){
           session.setAttribute("userAdmin",user.getStatu());
           session.setAttribute("username",user.getUsername());
           return "redirect:/main.html";
       }else{
           model.addAttribute("msg", "username or password maybe wrong,try again!");
           return "login";
       }

    }

    //注册用户
    @RequestMapping("/userRegister")
    public String register(User user,@Param("username") String username,@Param("password") String password,@Param("email")String email,@Param("country") String country) {
        userService.register(new User(username,password,email,country));
        return "login";
    }
    //注销
    @RequestMapping("/UserLogout")
    public String userLogout(HttpSession session){
        session.invalidate();
        return "login";
    }
    //去添加用户toAddUser
    @RequestMapping("/toAddUser")
    public String toAddUser(){
        return "pages/samples/AddUser";
    }
    //添加用户（Vip or simple）
    @RequestMapping("/AddUser")
    public String AddUser(User user,@Param("username") String username,@Param("password") String password,@Param("email")String email,@Param("country") String country,@Param("statu") Integer statu) {
        userService.AddUser(new User(username,password,email,country,statu));
        return "redirect:/emp/list";
    }
    //删除用户
    @RequestMapping("/DeleteUser/{id}")
    public String DeleteUserById(@PathVariable("id") Integer id){
        userService.DeleteUserById(id);
        return "redirect:/emp/list";
    }
    //去查找用户信息
    @RequestMapping("/FindUser/{id}")
    public String toUpdateUser(@PathVariable("id") Integer id,Model model){
        User user = userService.FindoneById(id);
        model.addAttribute("userInfo",user);
        System.out.println(user);
        return "pages/samples/UpdateUser";
    }
    //更改用户信息
    @RequestMapping("/updateUser")
    public String updateUser(User user,@Param("id") Integer id,@Param("username") String username,@Param("password") String password,@Param("email")String email,@Param("country") String country){
        user.setUsername(username);
        user.setCountry(country);
        user.setEmail(email);
        user.setPassword(password);
        userService.UpdateUser(user);
        return "redirect:/emp/list";
    }

}
