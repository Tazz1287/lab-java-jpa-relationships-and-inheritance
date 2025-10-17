package com.ironhack.lab8.repository;

import com.ironhack.lab8.model.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}
