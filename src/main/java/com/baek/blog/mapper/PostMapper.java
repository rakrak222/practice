package com.baek.blog.mapper;

import com.baek.blog.entity.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    Post findById(Long id);

    List<Post> findAll();

    void insertPost(Post post);

    void updatePost(Post post);

    void deletePost(Long id);
}
