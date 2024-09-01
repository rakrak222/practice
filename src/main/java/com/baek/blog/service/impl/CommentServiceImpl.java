package com.baek.blog.service.impl;

import com.baek.blog.entity.Comment;
import com.baek.blog.mapper.CommentMapper;
import com.baek.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public Comment findById(Long id) {
        return commentMapper.findById(id);
    }

    @Override
    public List<Comment> findByPostId(Long postId) {
        return commentMapper.findByPostId(postId);
    }

    @Override
    public void createComment(Comment comment) {
        commentMapper.insertComment(comment);
    }

    @Override
    public void updateComment(Comment comment) {
        comment.setUpdatedAt(LocalDateTime.now());
        commentMapper.updateComment(comment);
    }

    @Override
    public void deleteComment(Long id) {
        commentMapper.deleteComment(id);
    }
}
