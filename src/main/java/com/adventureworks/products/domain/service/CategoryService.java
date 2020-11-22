package com.adventureworks.products.domain.service;

import com.adventureworks.products.domain.service.dto.CategoryDto;
import com.adventureworks.products.persistence.entity.Category;

import java.util.List;

public interface CategoryService {
    CategoryDto finById(Integer id);
    List<CategoryDto> findALl();
}
