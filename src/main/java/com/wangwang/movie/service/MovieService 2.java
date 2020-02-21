package com.wangwang.movie.service;


import com.wangwang.movie.po.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MovieService {

    Movie getMovie(Integer id);

    Page<Movie> listMovie(Pageable pageable);

    Movie saveMovie(Movie movie);

    Movie updateMovie(Integer id,Movie movie);

    void deleteMovie(Integer id);

}
