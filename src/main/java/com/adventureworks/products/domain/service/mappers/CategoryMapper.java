package com.adventureworks.products.domain.service.mappers;

import com.adventureworks.products.domain.service.dto.CategoryDto;
import com.adventureworks.products.persistence.entity.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryDto toCategoryDto(Category entity);
    List<CategoryDto> toCategoriesDto(List<Category> entity);

    Category toCategory(CategoryDto dto);

}
