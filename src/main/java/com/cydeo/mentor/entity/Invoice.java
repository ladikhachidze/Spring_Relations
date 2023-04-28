package com.cydeo.mentor.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


@Getter
@Setter
@Entity
@NoArgsConstructor
public class Invoice extends BaseEntity{

    private String invoiceNumber;
    private String invoiceType;

    private LocalDate invoiceDate;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "client_id")
    private Client client;

/*  This field will be used in STEP-3
    private Client client;

 */
}
