package com.baek.blog.service;

import com.baek.blog.entity.Tag;

import java.util.List;

public interface TagService {
    Tag findById(Long id);

    List<Tag> findAll();

    void createTag(Tag tag);

    void updateTag(Tag tag);

    void deleteTag(Long id);
}
