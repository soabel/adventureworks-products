package com.adventureworks.products.domain.service.impl;

import com.adventureworks.products.domain.service.CategoryService;
import com.adventureworks.products.domain.service.dto.CategoryDto;
import com.adventureworks.products.domain.service.mappers.CategoryMapper;
import com.adventureworks.products.persistence.entity.Category;
import com.adventureworks.products.persistence.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public CategoryDto finById(Integer id) {
        var category = this.categoryRepository.findById(id).get();
        return this.categoryMapper.toCategoryDto(category);
    }

    @Override
    public List<CategoryDto> findALl() {
        var categories = this.categoryRepository.findAll();
        return this.categoryMapper.toCategoriesDto(categories);
    }
}
