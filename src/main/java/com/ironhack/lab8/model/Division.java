package com.ironhack.lab8.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String district;

    @OneToOne
    @JoinColumn(name = "president_id")
    private Member president;

    @OneToMany(mappedBy = "division", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Member> members = new ArrayList<>();

    public Division() {
    }

    public Division(String name, String district) {
        this.name = name;
        this.district = district;
    }

    public void addMember(Member member) {
        members.add(member);
        member.setDivision(this);
    }
    public void removeMember(Member member) {
        members.remove(member);
        member.setDivision(null);
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
