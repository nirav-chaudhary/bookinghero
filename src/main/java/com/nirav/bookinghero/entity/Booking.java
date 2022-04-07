package com.nirav.bookinghero.entity;


import com.nirav.bookinghero.enums.BookingStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
public class Booking {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id",nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "show_id",nullable = false)
    private Show show;

    @OneToMany
    private Set<ShowSeat> seatsBooked;

    private BookingStatus bookingStatus;

    private Date bookingTime;
}
