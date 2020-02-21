package com.wangwang.movie.dao;

import com.wangwang.movie.po.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {

    @Query("select t from Ticket t where t.movie.id =:mid and t.cinema.id =:cid " +
            "and t.SeatCol =:col and t.SeatRow =:row")
    Ticket findUniqueTicketById(@Param("row") Integer row,
                                @Param("col") Integer col,
                                @Param("mid") Integer mid,
                                @Param("cid") Integer cid);

    @Query("select t from Ticket t where t.movie.id =:mid and t.cinema.id =:cid")
    List<Ticket> findAllByMidAndCid(@Param("mid") Integer id, @Param("cid") Integer cid);
}
