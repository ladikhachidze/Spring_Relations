package com.cydeo.mentor.entity;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@Entity
@NoArgsConstructor
public class Address extends BaseEntity {


    private String description;
    private String zipCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "state_id")
    private State state;

    /*  This field will be used in STEP-3
    private State state;

     */
}
