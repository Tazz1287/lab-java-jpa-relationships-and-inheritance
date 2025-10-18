package com.ironhack.lab8.repository;

import com.ironhack.lab8.model.InternalTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternalTaskRepository extends JpaRepository<InternalTask, Long> {
}
