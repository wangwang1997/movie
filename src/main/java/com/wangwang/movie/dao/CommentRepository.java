package com.wangwang.movie.dao;

import com.wangwang.movie.po.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CommentRepository extends JpaRepository<Comment,Integer> {

    @Query("select c from Comment c where c.id = :#{#id}")
    Comment getCommentByMId(@Param("id") Integer id);
}
