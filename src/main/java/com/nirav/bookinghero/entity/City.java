package com.nirav.bookinghero.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Getter
@Setter
@Entity
public class City {

    @Id
    private Long id;
    private String name;
    private String state;

    @OneToMany(mappedBy = "city")
    private Set<Theater> theaters;
}
