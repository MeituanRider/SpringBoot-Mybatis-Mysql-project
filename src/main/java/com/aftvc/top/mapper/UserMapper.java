package com.aftvc.top.mapper;

import com.aftvc.top.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    //查询所有人信息
    List<User> getAllUsers();
    //获得账户名密码
    User login(String username,String password);
    //注册用户
    void register(User user);
    //添加是否为vip的用户
    void AddUser(User user);
    //删除用户
    void DeleteUserById(Integer id);
    //修改用户信息
    void UpdateUser(User user);
    //根据id查找用户信息
    User FindoneById(Integer id);
    //查找用户名称是否存在
    User FindoneByName(String username);

}
