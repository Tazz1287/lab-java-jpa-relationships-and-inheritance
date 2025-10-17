package com.ironhack.lab8.repository;

import com.ironhack.lab8.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
