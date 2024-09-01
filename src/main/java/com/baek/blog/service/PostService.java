package com.baek.blog.service;

import com.baek.blog.entity.Post;

import java.util.List;

public interface PostService {
    Post findById(Long id);

    List<Post> findAll();

    void createPost(Post post);

    void updatePost(Post post);

    void deletePost(Long id);
}
