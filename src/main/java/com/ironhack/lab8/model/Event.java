package com.ironhack.lab8.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private LocalDateTime date;
    private Integer duration;
    private String location;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "event_guest", joinColumns = @JoinColumn(name = "event_id"),
    inverseJoinColumns = @JoinColumn(name = "guest_id"))
    private List<Guest> guests = new ArrayList<>();

    public Event() {
    }

    public Event(String title, LocalDateTime date, Integer duration, String location) {
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.location = location;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", duration=" + duration +
                ", location='" + location + '\'' +
                ", guests=" + guests +
                '}';
    }
}
