package com.baek.blog.service.impl;

import com.baek.blog.entity.Tag;
import com.baek.blog.mapper.TagMapper;
import com.baek.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;

    @Override
    public Tag findById(Long id) {
        return tagMapper.findById(id);
    }

    @Override
    public List<Tag> findAll() {
        return tagMapper.findAll();
    }

    @Override
    public void createTag(Tag tag) {
        tagMapper.insertTag(tag);
    }

    @Override
    public void updateTag(Tag tag) {
        tagMapper.updateTag(tag);
    }

    @Override
    public void deleteTag(Long id) {
        tagMapper.deleteTag(id);
    }
}
