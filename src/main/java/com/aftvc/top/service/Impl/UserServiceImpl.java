package com.aftvc.top.service.Impl;

import com.aftvc.top.mapper.UserMapper;
import com.aftvc.top.pojo.User;
import com.aftvc.top.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @ Author     ：Yan
 * @ Date       ：Created in 16:41 2020/4/14
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    public User login(String username, String password) {
        User user = userMapper.login(username, password);
        return user;
    }

    @Override
    public void register(User user) {
        userMapper.register(user);
    }

    @Override
    public void AddUser(User user) {
        userMapper.AddUser(user);
    }

    @Override
    public void DeleteUserById(Integer id) {
        userMapper.DeleteUserById(id);
    }

    @Override
    public void UpdateUser(User user) {
        userMapper.UpdateUser(user);
    }

    @Override
    public User FindoneById(Integer id) {
        User user = userMapper.FindoneById(id);
        return user;
    }

    @Override
    public User FindoneByName(String username) {
        User user=userMapper.FindoneByName(username);
        return user;
    }


}
