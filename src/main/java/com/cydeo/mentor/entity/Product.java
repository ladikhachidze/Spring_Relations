package com.cydeo.mentor.entity;

import lombok.Data;

@Data
public class Product extends BaseEntity {

    private String name;
    private double price;

/*  This field will be used in STEP-3
    private Category category;

 */
}
