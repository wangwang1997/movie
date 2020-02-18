package com.wangwang.movie.service;

import com.wangwang.movie.dao.ShowMovieRepository;
import com.wangwang.movie.po.ShowMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class ShowMovieServiceImpl implements ShowMovieService {

    @Autowired
    private ShowMovieRepository showMovieRepository;

    @Transactional
    @Override
    public Page<ShowMovie> listShow(Pageable pageable) {
        return showMovieRepository.findAll(pageable);
    }

    @Transactional
    @Override
    public ShowMovie getMovie(Integer id) {
        return showMovieRepository.getOne(id);
    }


}
