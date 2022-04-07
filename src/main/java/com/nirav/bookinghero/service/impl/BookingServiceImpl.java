package com.nirav.bookinghero.service.impl;

import com.nirav.bookinghero.entity.Booking;
import com.nirav.bookinghero.exception.BookingNotFoundException;
import com.nirav.bookinghero.repository.BookingRepository;
import com.nirav.bookinghero.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepository bookingRepo;

    @Override
    public Booking getBookingByBookingId(Long bookingId) {
        Booking booking = bookingRepo.findById(bookingId)
                .orElseThrow(() -> new BookingNotFoundException("No booking exists with given id"));
        return booking;
    }

    @Override
    public void createBooking(Booking booking) {

    }
}
