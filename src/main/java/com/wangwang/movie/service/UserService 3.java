package com.wangwang.movie.service;

import com.wangwang.movie.po.User;

public interface UserService{
    User checkUser(String username, String password);

    User getUserWant(Integer id);

}
