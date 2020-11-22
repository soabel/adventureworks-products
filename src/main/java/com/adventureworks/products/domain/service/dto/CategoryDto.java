package com.adventureworks.products.domain.service.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    private Integer id;
    private Integer parentId;
    private String name;
}
