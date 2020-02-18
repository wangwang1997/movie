package com.wangwang.movie.service;

import com.wangwang.movie.po.Cinema;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CinemaService {
    Page<Cinema> listCinema(Pageable pageable);

    Cinema getCinema(Integer id);
}
