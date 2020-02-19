package com.wangwang.movie.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity//对应数据库
@Table(name = "t_movie")
public class Movie {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;//电影id
    @Column(name = "movie_name")
    private String name;//电影名
    @Column(name = "movie_IntelName")
    private String IntelName;//外语名
    @Column(name = "movie_img")
    private String image;//电影海报
    private String pic;//电影预览图
    private String type;//电影类型
    private String duration;//电影时长
    private String content;//电影内容介绍
    private String district;//上映地区
    private String director;//导演
    private String actors;//演员
    private Double score;//评分
    private Integer wantSee;//想看
    @Temporal(TemporalType.TIMESTAMP)
    private Date showTime;//上映时间
    @Temporal(TemporalType.TIMESTAMP)
    private Date releaseTime;//下映时间

    @OneToMany(mappedBy = "movie")
    private List<Ticket> tickets = new ArrayList<>();

    @OneToOne
    private ShowMovie showMovies;

    @ManyToMany
    private List<User> wantSee_users = new ArrayList<>();
    @ManyToMany
    private List<User> hasSeen_users = new ArrayList<>();

    public Movie() {
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

    public String getIntelName() {
        return IntelName;
    }

    public void setIntelName(String intelName) {
        IntelName = intelName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getWantSee() {
        return wantSee;
    }

    public void setWantSee(Integer wantSee) {
        this.wantSee = wantSee;
    }

    public Date getShowTime() {
        return showTime;
    }

    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }

    public ShowMovie getShowMovies() {
        return showMovies;
    }

    public void setShowMovies(ShowMovie showMovies) {
        this.showMovies = showMovies;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public List<User> getWantSee_users() {
        return wantSee_users;
    }

    public void setWantSee_users(List<User> wantSee_users) {
        this.wantSee_users = wantSee_users;
    }

    public List<User> getHasSeen_users() {
        return hasSeen_users;
    }

    public void setHasSeen_users(List<User> hasSeen_users) {
        this.hasSeen_users = hasSeen_users;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", IntelName='" + IntelName + '\'' +
                ", image='" + image + '\'' +
                ", pic='" + pic + '\'' +
                ", type='" + type + '\'' +
                ", duration='" + duration + '\'' +
                ", content='" + content + '\'' +
                ", district='" + district + '\'' +
                ", director='" + director + '\'' +
                ", actors='" + actors + '\'' +
                ", score=" + score +
                ", wantSee=" + wantSee +
                ", showTime=" + showTime +
                ", releaseTime=" + releaseTime +
                ", wantSee_users=" + wantSee_users +
                ", hasSeen_users=" + hasSeen_users +
                '}';
    }
}
