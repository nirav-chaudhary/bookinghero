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
    Long id;
    String name;
    String state;

    @OneToMany(mappedBy = "city")
    Set<Theater> theaters;
}
