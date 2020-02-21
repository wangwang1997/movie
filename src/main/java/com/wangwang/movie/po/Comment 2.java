package com.wangwang.movie.po;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_comment")
public class Comment {

    @Id
    @GeneratedValue
    private Integer id;//评论id
    private String content;//评论内容
    private Date postDate;//评论时间

    @ManyToOne
    private ShowMovie showMovies;

    @ManyToOne
    private User user;

    public Comment() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ShowMovie getShowMovies() {
        return showMovies;
    }

    public void setShowMovies(ShowMovie showMovies) {
        this.showMovies = showMovies;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", postDate=" + postDate +
                ", showMovies=" + showMovies +
                ", user=" + user +
                '}';
    }
}
