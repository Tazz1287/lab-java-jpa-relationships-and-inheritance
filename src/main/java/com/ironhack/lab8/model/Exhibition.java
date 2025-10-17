package com.ironhack.lab8.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "exhibition")
public class Exhibition extends Event {
    public Exhibition() {super();}

    public Exhibition(String title, LocalDateTime date, Integer duration, String location) {
        super(title, date, duration, location);
    }
}
