package com.wangwang.movie.po;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_cinema")
public class Cinema {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;//电影院名

    private String ting;//放映厅

    private String location;//地址

    @ManyToMany(mappedBy = "cinemas")
    private List<ShowMovie> showMovies = new ArrayList<>();

    public Cinema() {
    }


    public List<ShowMovie> getShowMovies() {
        return showMovies;
    }

    public void setShowMovies(List<ShowMovie> showMovies) {
        this.showMovies = showMovies;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTing() {
        return ting;
    }

    public void setTing(String ting) {
        this.ting = ting;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public String toString() {
        return "Cinema{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ting='" + ting + '\'' +
                ", location='" + location + '\'' +
                ", showMovies=" + showMovies +
                '}';
    }
}
