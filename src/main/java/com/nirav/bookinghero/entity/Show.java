package com.nirav.bookinghero.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Show {

    @Id
    Long id;

    Date startDate;

    Date endDate;

    @ManyToOne
    @JoinColumn(name = "screen_id", nullable = false)
    Screen screen;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    Movie movie;
}
