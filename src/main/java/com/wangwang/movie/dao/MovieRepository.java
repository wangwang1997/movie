package com.wangwang.movie.dao;

import com.wangwang.movie.po.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MovieRepository extends JpaRepository<Movie,Integer> {

    @Query("select m from Movie m where m.showTime > current_date ")
    Page<Movie> findNewComing(Pageable pageable);
}
