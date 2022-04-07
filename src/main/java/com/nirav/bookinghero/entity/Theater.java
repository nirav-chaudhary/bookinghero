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
public class Theater {

    @Id
    Long id;

    String name;

    @ManyToOne
    @JoinColumn(name = "cart_id", nullable = false)
    City city;
}
