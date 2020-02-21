package com.wangwang.movie.service;

import com.wangwang.movie.dao.CommentRepository;
import com.wangwang.movie.po.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Transactional
    @Override
    public Comment getComment(Integer id) {
        return commentRepository.getCommentByMId(id);
    }
}
