package com.wangwang.movie.dao;

import com.wangwang.movie.po.ShowMovie;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ShowMovieRepository extends JpaRepository<ShowMovie,Integer> {


}
