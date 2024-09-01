package com.baek.blog.service;

import com.baek.blog.entity.Category;

import java.util.List;

public interface CategoryService {
    Category findById(Long id);

    List<Category> findAll();

    void createCategory(Category category);

    void updateCategory(Category category);

    void deleteCategory(Long id);
}
