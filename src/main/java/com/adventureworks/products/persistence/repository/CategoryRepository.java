package com.adventureworks.products.persistence.repository;

import com.adventureworks.products.persistence.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
