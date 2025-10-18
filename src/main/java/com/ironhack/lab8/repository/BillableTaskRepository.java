package com.ironhack.lab8.repository;

import com.ironhack.lab8.model.BillableTask;
import com.ironhack.lab8.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillableTaskRepository extends JpaRepository<BillableTask, Long> {
}
