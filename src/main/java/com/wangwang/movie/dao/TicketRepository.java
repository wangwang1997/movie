package com.wangwang.movie.dao;

import com.wangwang.movie.po.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {

    @Query("select t from Ticket t where t.movie.id =:mid and t.user.id =:uid ")
    Ticket findUniqueTicketById(@Param("mid") Integer mid, @Param("uid") Integer uid);

    @Query("select t from Ticket t where t.movie.id =:mid and t.cinema.id =:cid")
    List<Ticket> findAllByMidAndCid(@Param("mid") Integer id, @Param("cid") Integer cid);
}
