package com.ironhack.lab8.demo;

import com.ironhack.lab8.enums.GuestStatus;
import com.ironhack.lab8.enums.MemberStatus;
import com.ironhack.lab8.model.*;
import com.ironhack.lab8.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import com.ironhack.lab8.model.Association;
import com.ironhack.lab8.model.Division;
import com.ironhack.lab8.model.Member;
import com.ironhack.lab8.enums.MemberStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Component
public class DataLoader implements CommandLineRunner {

    private final ContactRepository contactRepository;
    private final AssociationRepository associationRepository;
    private final DivisionRepository divisionRepository;
    private final MemberRepository memberRepository;
    private final GuestRepository guestRepository;
    private final ConferenceRepository conferenceRepository;
    private final ExhibitionRepository exhibitionRepository;

    public DataLoader(ContactRepository contactRepository,
                      AssociationRepository associationRepository,
                      DivisionRepository divisionRepository,
                      MemberRepository memberRepository,
                      GuestRepository guestRepository,
                      ConferenceRepository conferenceRepository,
                      ExhibitionRepository exhibitionRepository) {
        this.contactRepository = contactRepository;
        this.associationRepository = associationRepository;
        this.divisionRepository = divisionRepository;
        this.memberRepository = memberRepository;
        this.guestRepository = guestRepository;
        this.conferenceRepository = conferenceRepository;
        this.exhibitionRepository = exhibitionRepository;
    }

    @Override
    public void run(String... args)  {
        contactRepository.save(new Contact("Amazon", "Andon Cord",new Name("MR", "Murad", "Ibrahim", "Aliosman")));

        Association association = new Association("Nurse Association of Mallorca");

        Division d1 = new Division("First Division","District 1");
        Member m1 = new Member("Murad Ibrahim", MemberStatus.ACTIVE, LocalDate.of(2025, 1, 1));
        d1.addMember(m1);
        d1.setPresident(m1);
        association.addDivision(d1);


        Division d2 = new Division("East Division", "District 2");
        Member m2 = new Member("Bob Johnson", MemberStatus.LAPSED, LocalDate.of(2025,12,1));
        d2.addMember(m2);
        d2.setPresident(m2);
        association.addDivision(d2);


        Division d3 = new Division("South Division", "District 3");
        Member m3 = new Member("Clara Lee", MemberStatus.ACTIVE, LocalDate.of(2026,6,10));
        d3.addMember(m3);
        d3.setPresident(m3);
        association.addDivision(d3);

        Division d4 = new Division("West Division", "District 1");
        Member m4 = new Member("David Kim", MemberStatus.LAPSED, LocalDate.of(2025,9,30));
        d4.addMember(m4);
        d4.setPresident(m4);
        association.addDivision(d4);


        Division d5 = new Division("Central Division", "District 2");
        Member m5 = new Member("Eva Brown", MemberStatus.ACTIVE, LocalDate.of(2026,1,20));
        d5.addMember(m5);
        d5.setPresident(m5);
        association.addDivision(d5);


        Division d6 = new Division("Uptown Division", "District 3");
        Member m6 = new Member("Frank Green", MemberStatus.ACTIVE, LocalDate.of(2026,4,5));
        d6.addMember(m6);
        d6.setPresident(m6);
        association.addDivision(d6);


        Division d7 = new Division("Downtown Division", "District 1");
        Member m7 = new Member("Grace White", MemberStatus.LAPSED, LocalDate.of(2025,11,12));
        d7.addMember(m7);
        d7.setPresident(m7);
        association.addDivision(d7);

        associationRepository.save(association);

        Guest g1 = new Guest("Murad", GuestStatus.ATTENDING);
        Guest g2 = new Guest("Bob Johnson", GuestStatus.NO_RESPONSE);
        Guest g3 = new Guest("Clara Lee", GuestStatus.NOT_ATTENDING);

        guestRepository.saveAll(List.of(g1,g2,g3));

        Conference conference = new Conference("JavaConf 2026",
                LocalDateTime.of(2025, 10, 17, 14, 30), 480, "Madrid");
        conference.addGuest(g1);
        conference.addGuest(g2);
        conference.addSpeaker(new Speaker("Dr. Smith", 45));
        conference.addSpeaker(new Speaker("Prof. Lee", 30));
        conferenceRepository.save(conference);

        Exhibition exhibition = new Exhibition("Health Expo 2026",
                LocalDateTime.of(2026, 3, 17, 12, 10), 360, "Barcelona");
        exhibition.addGuest(g3);
        exhibitionRepository.save(exhibition);
    }





}