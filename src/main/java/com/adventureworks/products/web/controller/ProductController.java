package com.adventureworks.products.web.controller;

import com.adventureworks.products.domain.service.ProductService;
import com.adventureworks.products.domain.service.dto.ProductDto;
import com.adventureworks.products.domain.service.mappers.ProductMapper;
import com.adventureworks.products.persistence.entity.Product;
import com.adventureworks.products.web.request.FindProductRequest;
import com.adventureworks.products.web.request.SaveProductRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.BindException;
import java.util.List;
import java.util.Optional;

@Controller()
@RequestMapping("products")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    @ResponseBody()
    Product getByIdProduct(@PathVariable("id") Integer id) {
        logger.info("getByIdProduct");
        var product = this.productService.getById(id);
        return product;
    }

    @GetMapping()
    @ResponseBody()
    List<ProductDto> findAll(@RequestParam("name") Optional<String> name) {
        var products = this.productService.find(name.isPresent() ? name.get() : "");
        return products;
    }

    @GetMapping("/find")
    @ResponseBody()
    List<ProductDto> findAll(@Valid FindProductRequest param){
        var products = this.productService.findByParams(param);
        return products;
    }

    @PostMapping()
    @ResponseBody()
    Product save(@RequestBody() ProductDto productDto){
        var result = this.productService.save(productDto);
        return result;
    }

    @PutMapping()
    @ResponseBody()
    Product update(@RequestBody() ProductDto productDto){
        var result = this.productService.update(productDto);
        return result;
    }

}
