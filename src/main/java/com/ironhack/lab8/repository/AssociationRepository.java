package com.ironhack.lab8.repository;

import com.ironhack.lab8.model.Association;
import com.ironhack.lab8.model.Division;
import com.ironhack.lab8.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssociationRepository extends JpaRepository<Association, Long> {}
