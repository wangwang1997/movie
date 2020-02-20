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

    private String JsonPath = "static/json/seat.json";

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
            List<Seat> seats = JsonUtil.readArray(JsonPath, Seat.class);
            //System.out.println(seats);
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
    public Boolean getTicketByUnique(Integer row, Integer col, Integer mid, Integer cid) {
        try {
            Ticket ticket = ticketRepository.findUniqueTicketById(row, col, mid, cid);
           // System.out.println(ticket);
            if (ticket != null) {
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
            Integer row = this.getSeatForMovie(cid).getRow();
            Integer col = this.getSeatForMovie(cid).getColumn();
            //System.out.println(row + "排" + col + "列");
            List<Seat> seats = new ArrayList<>();

                for(int r=1;r<=row;r++){
                    for(int c=1;c<=col;c++){
                        Seat seat = new Seat();
                        seat.setNum(cid);
                        seat.setColumn(c);
                        seat.setRow(r);
                        for (Ticket ticket:tickets
                        ) {
                        if(ticket.getSeatRow() == r && ticket.getSeatCol() == c){
                            seat.setSelled(true);//表明已经卖掉了
                            break;
                        }else{
                            seat.setSelled(false);//
                        }
                    }
                        seats.add(seat);
                }
            }
            //System.out.println(seats);
            return seats;
        }catch (NotFoundException e){
            e.printStackTrace();
        }
        return null;
    }


}
