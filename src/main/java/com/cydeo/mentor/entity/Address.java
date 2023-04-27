package com.cydeo.mentor.entity;

import lombok.*;



@Data
public class Address {

    private Long id;
    private String description;
    private String zipCode;

    /*  This field will be used in STEP-3
    private State state;

     */
}
