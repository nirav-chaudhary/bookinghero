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
    private Long id;

    private String name;
    private Date releaseDate;
    private Date duration;
    private String description;
    private Integer rating;

    @ManyToOne
    @JoinColumn(name="language_id",nullable = false)
    private Language language;

    @ManyToOne
    @JoinColumn(name="genre_id")
    private Genre genre;

}
