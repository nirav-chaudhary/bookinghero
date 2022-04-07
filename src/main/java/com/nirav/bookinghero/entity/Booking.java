package com.nirav.bookinghero.entity;


import com.nirav.bookinghero.enums.BookingStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
public class Booking {

    @Id
    private Long id;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Show show;

    @OneToMany
    private Set<ShowSeat> seatsBooked;

    private BookingStatus bookingStatus;

    private Date bookingTime;
}
