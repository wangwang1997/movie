package com.wangwang.movie.service;

import com.wangwang.movie.dao.CinemaRepository;
import com.wangwang.movie.po.Cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CinemaServiceImpl implements CinemaService {

    @Autowired
    private CinemaRepository cinemaRepository;

    @Transactional
    @Override
    public Page<Cinema> listCinema(Pageable pageable) {
        return cinemaRepository.findAll(pageable);
    }

    @Transactional
    @Override
    public Cinema getCinema(Integer id) {
        return cinemaRepository.getOne(id);
    }
}
