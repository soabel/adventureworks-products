package com.adventureworks.products.persistence.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ProductCategory", schema = "SalesLT")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductCategoryID")
    private Integer id;
    @Column(name = "ParentProductCategoryID")
    private Integer parentId;
    @Column(name = "Name")
    private String name;
}
