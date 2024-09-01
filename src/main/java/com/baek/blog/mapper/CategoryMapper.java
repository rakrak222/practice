package com.baek.blog.mapper;

import com.baek.blog.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    Category findById(Long id);

    List<Category> findAll();

    void insertCategory(Category category);

    void updateCategory(Category category);

    void deleteCategory(Long id);
}
