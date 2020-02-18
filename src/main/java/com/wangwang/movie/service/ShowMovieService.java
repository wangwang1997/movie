package com.wangwang.movie.service;

import com.wangwang.movie.po.Cinema;
import com.wangwang.movie.po.ShowMovie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ShowMovieService {

    Page<ShowMovie> listShow(Pageable pageable);

    ShowMovie getMovie(Integer id);

    Page<Cinema> getCinemasById(Integer id,Pageable pageable);
}
