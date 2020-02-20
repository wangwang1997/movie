package com.wangwang.movie.service;

import com.wangwang.movie.po.Cinema;
import com.wangwang.movie.po.Seat;
import com.wangwang.movie.po.ShowMovie;
import com.wangwang.movie.po.Ticket;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface ShowMovieService {

    Page<ShowMovie> listShow(Pageable pageable);

    ShowMovie getMovie(Integer id);

    Page<Cinema> getCinemasById(Integer id,Pageable pageable);

    Seat getSeatForMovie(Integer cid);

    Boolean getTicketByUnique(Integer row, Integer col, Integer mid, Integer cid);

    List<Seat> getSeats(Integer id, Integer cid);
}
