package com.ironhack.lab8.repository;

import com.ironhack.lab8.enums.GuestStatus;
import com.ironhack.lab8.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByStatus(GuestStatus status);
}
