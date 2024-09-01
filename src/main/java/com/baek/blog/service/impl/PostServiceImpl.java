package com.baek.blog.service.impl;

import com.baek.blog.entity.Post;
import com.baek.blog.mapper.PostMapper;
import com.baek.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostMapper postMapper;

    @Override
    public Post findById(Long id) {
        return postMapper.findById(id);
    }

    @Override
    public List<Post> findAll() {
        return postMapper.findAll();
    }

    @Override
    public void createPost(Post post) {
        postMapper.insertPost(post);
    }

    @Override
    public void updatePost(Post post) {
        post.setUpdatedAt(LocalDateTime.now());
        postMapper.updatePost(post);
    }

    @Override
    public void deletePost(Long id) {
        postMapper.deletePost(id);
    }
}
