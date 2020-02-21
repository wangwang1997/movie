package com.wangwang.movie.service;

import com.wangwang.movie.NotFoundException;
import com.wangwang.movie.dao.MovieRepository;
import com.wangwang.movie.po.Movie;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Transactional
    @Override
    public Movie getMovie(Integer id) {
        return movieRepository.getOne(id);
    }

    @Transactional
    @Override
    public Page<Movie> listMovie(Pageable pageable) {
        return movieRepository.findNewComing(pageable);
    }

    @Transactional
    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Transactional
    @Override
    public Movie updateMovie(Integer id, Movie movie) {
        Movie m = movieRepository.getOne(id);
        if( m == null){
            throw new NotFoundException("不存在该电影");
        }
        BeanUtils.copyProperties(movie,m);

        return movieRepository.save(m);
    }

    @Transactional
    @Override
    public void deleteMovie(Integer id) {
         movieRepository.deleteById(id);
    }
}
