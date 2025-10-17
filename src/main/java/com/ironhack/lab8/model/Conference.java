package com.ironhack.lab8.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Conference extends Event {

    @OneToMany(mappedBy = "conference", cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.LAZY)
    private List <Speaker> speakers = new ArrayList<>();

    public Conference() {super();}
    public Conference(String title, LocalDateTime date, Integer duration, String location) {
        super(title, date, duration, location);
    }

    public void addSpeaker(Speaker s){
        speakers.add(s);
        s.setConference(this);
    }

    public void removeSpeaker(Speaker s){
        speakers.remove(s);
        s.setConference(this);
    }

    public List<Speaker> getSpeakers() { return speakers; }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }
}
