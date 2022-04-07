package com.nirav.bookinghero.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@Setter
@Entity
public class Movie {

    @Id
    Long id;

    String name;
    Date releaseDate;
    Date duration;
    String description;

    @ManyToOne
    @JoinColumn(name="language_id",nullable = false)
    Language language;

    @ManyToOne
    @JoinColumn(name="genre_id")
    Genre genre;

}
