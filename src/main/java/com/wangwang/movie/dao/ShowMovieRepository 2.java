package com.wangwang.movie.dao;

import com.wangwang.movie.po.Cinema;
import com.wangwang.movie.po.ShowMovie;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ShowMovieRepository extends JpaRepository<ShowMovie,Integer> {

    @Query("select s.cinemas from ShowMovie s where s.id = :id")
    Page<Cinema> findCinemasById(@Param("id") Integer id,Pageable pageable);
}
