package com.cydeo.mentor.entity;

import lombok.Data;

@Data
public class Client extends BaseEntity {

    private String clientName;
    private String phone;
    private String email;

/*  This field will be used in STEP-3
    private Address address;

 */
}
