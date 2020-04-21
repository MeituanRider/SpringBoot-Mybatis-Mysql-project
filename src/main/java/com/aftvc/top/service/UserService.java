package com.aftvc.top.service;

import com.aftvc.top.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User login(String username,String password);
    void register(User user);
    void AddUser(User user);
    void DeleteUserById(Integer id);
    void UpdateUser(User user);
    User FindoneById(Integer id);
    User FindoneByName(String username);
}
