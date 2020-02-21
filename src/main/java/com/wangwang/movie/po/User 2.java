package com.wangwang.movie.po;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue
    private Integer id;//用户编号
    private String username;//用户名
    private String password;//用户密码
    private String img;//头像

    @ManyToMany(mappedBy = "wantSee_users",fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<Movie> wantSee = new ArrayList<>();
    @ManyToMany(mappedBy = "hasSeen_users",fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<Movie> hasSeen = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Comment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Ticket> tickets = new ArrayList<>();



    private String phone;//联系电话

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<Movie> getWantSee() {
        return wantSee;
    }

    public void setWantSee(List<Movie> wantSee) {
        this.wantSee = wantSee;
    }

    public List<Movie> getHasSeen() {
        return hasSeen;
    }

    public void setHasSeen(List<Movie> hasSeen) {
        this.hasSeen = hasSeen;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + username + '\'' +
                ", password='" + password + '\'' +
                ", img='" + img + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
