package com.wangwang.movie.dao;

import com.wangwang.movie.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{

    User findByUsernameAndPassword(String username,String password);
}
