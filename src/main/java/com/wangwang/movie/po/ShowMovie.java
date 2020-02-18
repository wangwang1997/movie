package com.wangwang.movie.po;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_show")
public class ShowMovie {

    @Id
    @GeneratedValue
    private Integer id;//  上映电影id
    private String time;//上映时间段
    private String version;//上映版本
    private String price;//票价区间
    private String showTing;//放映厅

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id",referencedColumnName = "id",nullable = false)
    private Movie movie;

    @ManyToMany(fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    List<Cinema> cinemas = new ArrayList<>();


    @OneToMany(mappedBy = "showMovies")
    private List<Comment> comments = new ArrayList<>();

    public ShowMovie() {
    }

    public List<Cinema> getCinemas() {
        return cinemas;
    }

    public void setCinemas(List<Cinema> cinemas) {
        this.cinemas = cinemas;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getShowTing() {
        return showTing;
    }

    public void setShowTing(String showTing) {
        this.showTing = showTing;
    }

    @Override
    public String toString() {
        return "ShowMovie{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", version='" + version + '\'' +
                ", price='" + price + '\'' +
                ", showTing='" + showTing + '\'' +
                ", movie=" + movie +
                ", comments=" + comments +
                '}';
    }
}
