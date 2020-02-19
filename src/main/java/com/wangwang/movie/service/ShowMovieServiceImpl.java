package com.wangwang.movie.service;

import com.wangwang.movie.NotFoundException;
import com.wangwang.movie.dao.ShowMovieRepository;
import com.wangwang.movie.dao.TicketRepository;
import com.wangwang.movie.po.Cinema;
import com.wangwang.movie.po.Seat;
import com.wangwang.movie.po.ShowMovie;
import com.wangwang.movie.po.Ticket;
import com.wangwang.movie.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service
public class ShowMovieServiceImpl implements ShowMovieService {

    @Autowired
    private ShowMovieRepository showMovieRepository;

    @Autowired
    private TicketRepository ticketRepository;

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

    @Override
    public Page<Cinema> getCinemasById(Integer id, Pageable pageable) {
        return showMovieRepository.findCinemasById(id,pageable);
    }

    @Override
    public Seat getSeatForMovie(Integer cid) {
        try {
            List<Seat> seats = JsonUtil.readArray("static/json/seat.json", Seat.class);
            for (Seat seat:seats
                 ) {
                if(seat.getNum() == cid){
                    return  seat;
                }
            }
            return null;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Boolean getTicketByUnique(Integer row, Integer col, Integer mid, Integer id) {
        try {
            Ticket ticket = ticketRepository.findUniqueTicketById(mid, id);
            if (ticket.getSeatCol() == col && ticket.getSeatRow() == row) {
                return true;//已经有人买了这个位子的票
            }
        }catch(NotFoundException e){
            e.printStackTrace();
            }
        return false;//空位子
    }

    @Override
    public List<Seat> getSeats(Integer id, Integer  cid) {
        try{
            List<Ticket> tickets = ticketRepository.findAllByMidAndCid(id, cid);
            List<Seat> seats = new ArrayList<>();
            for (Ticket ticket:tickets
                 ) {
                Seat seat = new Seat();
                seat.setColumn(ticket.getSeatCol());
                seat.setRow(ticket.getSeatRow());
                seats.add(seat);
            }
            System.out.println(seats);
            return seats;
        }catch (NotFoundException e){
            e.printStackTrace();
        }
        return null;
    }


}
