package com.nirav.bookinghero.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class Screen {

    @Id
    Long id;
    String name;

    @ManyToOne
    @JoinColumn(name = "theater_id", nullable = false)
    Theater theater;

    Integer seats;
}
