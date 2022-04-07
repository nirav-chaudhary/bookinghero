package com.nirav.bookinghero.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
public abstract class User {

    @Id
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
}
