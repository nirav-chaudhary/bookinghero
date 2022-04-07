package com.nirav.bookinghero.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Language {

    @Id
    Long id;
    String name;
}
