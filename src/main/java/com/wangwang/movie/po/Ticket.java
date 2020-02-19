package com.wangwang.movie.po;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_ticket")
public class Ticket {

    @Id
    @GeneratedValue
    private Integer id;//

    private  Integer SeatRow;

    private Integer SeatCol;

    @Temporal(TemporalType.TIMESTAMP)
    private Date ClosingTime;

    @ManyToOne
    private User user;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private  Cinema cinema;


    public Ticket() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeatRow() {
        return SeatRow;
    }

    public void setSeatRow(Integer seatRow) {
        SeatRow = seatRow;
    }

    public Integer getSeatCol() {
        return SeatCol;
    }

    public void setSeatCol(Integer seatCol) {
        SeatCol = seatCol;
    }

    public Date getClosingTime() {
        return ClosingTime;
    }

    public void setClosingTime(Date closingTime) {
        ClosingTime = closingTime;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", SeatRow=" + SeatRow +
                ", SeatCol=" + SeatCol +
                ", ClosingTime=" + ClosingTime +
                '}';
    }
}
