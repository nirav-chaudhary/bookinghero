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
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "cart_id", nullable = false)
    private City city;

    @OneToMany(mappedBy = "theater")
    private Set<Screen> screens;

    private Integer totalSeats;
}
