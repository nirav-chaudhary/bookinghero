package com.nirav.bookinghero.controller;

import com.nirav.bookinghero.entity.Booking;
import com.nirav.bookinghero.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController(value = "/booking")

public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping(value = "/{bookingId}")
    public ResponseEntity<Booking> getBookingByBookingId(@RequestParam (name = "bookingId") Long bookingId){
        return ResponseEntity.ok(bookingService.getBookingByBookingId(bookingId));
    }


    @PostMapping(value = "/")
    public ResponseEntity<?> createBooking(@RequestBody Booking booking){
        bookingService.createBooking(booking);
        return ResponseEntity.ok().build();
    }
}
