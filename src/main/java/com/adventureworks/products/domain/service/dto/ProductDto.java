package com.adventureworks.products.domain.service.dto;

import java.util.Date;

public class ProductDto {
    private Integer id;
    private String name;
    private Double price;
    private String color;
    private String size;
    private Double weight;
    private String number;
    private Double standardCost;
    private Date sellStartDate;
    private String rowguid;
    private Date modifiedDate;

    public ProductDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getStandardCost() {
        return standardCost;
    }

    public void setStandardCost(Double standardCost) {
        this.standardCost = standardCost;
    }

    public Date getSellStartDate() {
        return sellStartDate;
    }

    public void setSellStartDate(Date sellStartDate) {
        this.sellStartDate = sellStartDate;
    }

    public String getRowguid() {
        return rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                ", number='" + number + '\'' +
                ", standardCost=" + standardCost +
                ", sellStartDate=" + sellStartDate +
                ", rowguid='" + rowguid + '\'' +
                ", modifiedDate=" + modifiedDate +
                '}';
    }
}
