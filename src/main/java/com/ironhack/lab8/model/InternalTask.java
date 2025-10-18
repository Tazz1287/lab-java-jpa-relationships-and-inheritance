package com.ironhack.lab8.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("INTERNAL")
public class InternalTask extends Task {

    public InternalTask() {
        super();
    }

    public InternalTask(String title, LocalDate dueDate, boolean completed) {
        super(title, dueDate, completed);
    }

}
