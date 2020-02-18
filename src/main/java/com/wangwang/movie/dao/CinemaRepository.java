package com.wangwang.movie.dao;

import com.wangwang.movie.po.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema,Integer> {

}
