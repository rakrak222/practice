package com.baek.blog.mapper;

import com.baek.blog.entity.Tag;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TagMapper {
    Tag findById(Long id);

    List<Tag> findAll();

    void insertTag(Tag tag);

    void updateTag(Tag tag);

    void deleteTag(Long id);
}
