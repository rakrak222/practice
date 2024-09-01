package com.baek.blog.mapper;

import com.baek.blog.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    Comment findById(Long id);

    List<Comment> findByPostId(Long postId);

    void insertComment(Comment comment);

    void updateComment(Comment comment);

    void deleteComment(Long id);
}
