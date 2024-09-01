package com.baek.blog.service;

import com.baek.blog.entity.Comment;

import java.util.List;

public interface CommentService {
    Comment findById(Long id);

    List<Comment> findByPostId(Long postId);

    void createComment(Comment comment);

    void updateComment(Comment comment);

    void deleteComment(Long id);
}
