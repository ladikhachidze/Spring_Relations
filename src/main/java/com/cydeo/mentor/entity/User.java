package com.cydeo.mentor.entity;

import lombok.Data;

@Data
public class User extends BaseEntity{

    private String firstname;
    private String lastname;
    private String password;
    private String email;

    /*  This field will be used in STEP-3
    private Role role;

     */

}
