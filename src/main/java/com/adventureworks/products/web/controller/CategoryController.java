package com.adventureworks.products.web.controller;

import com.adventureworks.products.domain.service.CategoryService;
import com.adventureworks.products.domain.service.dto.CategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/{id}")
    ResponseEntity<CategoryDto> getById(@PathVariable("id") int id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(this.categoryService.finById(id));
    }

    @GetMapping()
    ResponseEntity<List<CategoryDto>> getAll() {
        return ResponseEntity.ok()
                .header("transactionId","1326556")
                .body(this.categoryService.findALl());
    }

    @GetMapping("/find")
    @ResponseBody
    List<CategoryDto> find() {
        return this.categoryService.findALl();
    }

}
