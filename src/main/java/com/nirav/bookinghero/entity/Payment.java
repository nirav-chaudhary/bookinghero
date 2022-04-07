package com.nirav.bookinghero.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

@Getter
@Setter
@Entity
public class Payment {

    @Id
    private Long id;

    private Double amount;

    private String transactionId;

    private Date transactionTime;

    @OneToOne
    private Booking booking;
}
