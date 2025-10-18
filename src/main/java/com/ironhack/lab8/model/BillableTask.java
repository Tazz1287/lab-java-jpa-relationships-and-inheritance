package com.ironhack.lab8.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@DiscriminatorValue("BILLABLE")
public class BillableTask extends Task {

    private BigDecimal hourlyRate;

    public  BillableTask() {
        super();
    }

    public BillableTask(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public BillableTask(String title, LocalDate dueDate, boolean completed, BigDecimal hourlyRate) {
        super(title, dueDate, completed);
        this.hourlyRate = hourlyRate;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
