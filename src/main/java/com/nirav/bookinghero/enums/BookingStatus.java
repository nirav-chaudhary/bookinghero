package com.nirav.bookinghero.enums;

import lombok.Getter;

@Getter
public enum BookingStatus {
    Pending,
    Reserved,
    Paid,
    Confirmed,
    Cancelled
}
