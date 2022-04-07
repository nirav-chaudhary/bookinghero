package com.nirav.bookinghero.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

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

    @OneToMany(mappedBy = "theater")
    Set<Screen> screens;

    Integer totalSeats;
}
