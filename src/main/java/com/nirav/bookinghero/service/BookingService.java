package com.nirav.bookinghero.service;

import com.nirav.bookinghero.entity.Booking;

public interface BookingService {

    Booking getBookingByBookingId(Long bookingId);

    void createBooking (Booking booking);
}
