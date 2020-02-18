package com.wangwang.movie.dao;

import com.wangwang.movie.po.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CinemaRepository extends JpaRepository<Cinema,Integer> {

}
