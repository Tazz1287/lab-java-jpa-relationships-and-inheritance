package com.ironhack.lab8.repository;

import com.ironhack.lab8.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
