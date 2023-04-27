package com.cydeo.mentor.entity;

import lombok.Data;

import java.time.LocalDate;


@Data
public class Invoice extends BaseEntity{

    private String invoiceNumber;
    private String invoiceType;

    private LocalDate invoiceDate;

/*  This field will be used in STEP-3
    private Client client;

 */
}
