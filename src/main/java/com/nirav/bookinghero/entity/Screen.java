package com.nirav.bookinghero.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class Screen {

    @Id
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "theater_id", nullable = false)
    private Theater theater;

    private Integer seats;

    @OneToMany(mappedBy = "screen")
    private Set<Show> shows;
}
