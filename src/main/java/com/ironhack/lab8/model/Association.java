package com.ironhack.lab8.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Association {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "association_id")
    private List<Division> divisions = new ArrayList<>();

    public Association() {
    }

    public Association(String name) {
        this.name = name;
    }

    public void addDivision(Division division) {
        this.divisions.add(division);
    }

    public void removeDivision(Division division) {
        this.divisions.remove(division);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Division> getDivisions() {
        return divisions;
    }

    public void setDivisions(List<Division> divisions) {
        this.divisions = divisions;
    }

    @Override
    public String toString() {
        return "Assosication{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", divisions=" + divisions +
                '}';
    }
}
