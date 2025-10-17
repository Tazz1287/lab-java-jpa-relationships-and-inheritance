package com.ironhack.lab8.repository;

import com.ironhack.lab8.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
