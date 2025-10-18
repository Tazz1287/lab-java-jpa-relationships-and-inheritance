package com.ironhack.lab8.demo;

import com.ironhack.lab8.model.BillableTask;
import com.ironhack.lab8.model.InternalTask;
import com.ironhack.lab8.model.Task;
import com.ironhack.lab8.repository.BillableTaskRepository;
import com.ironhack.lab8.repository.InternalTaskRepository;
import com.ironhack.lab8.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDate;

@Configuration
public class DataLoaderTask {

    @Bean
    CommandLineRunner init(TaskRepository taskRepository, BillableTaskRepository billableTaskRepository, InternalTaskRepository internalTaskRepository) {
        return args -> {
            taskRepository.save(new Task("Buy coffee", LocalDate.now().plusDays(3),false));
            taskRepository.save(new Task("Plan sprint", LocalDate.now().plusDays(7), false));
            taskRepository.save(new Task("Year-end reporting", LocalDate.now().plusMonths(1), false));


            billableTaskRepository.save(new BillableTask("Client A - Implementation", LocalDate.now().plusDays(10), false, new BigDecimal("75.00")));
            billableTaskRepository.save(new BillableTask("Client B - Audit", LocalDate.now().plusDays(20), false, new BigDecimal("120.00")));
            billableTaskRepository.save(new BillableTask("Client C - Support", LocalDate.now().plusDays(5), true, new BigDecimal("60.00")));


            internalTaskRepository.save(new InternalTask("Refactor module X", LocalDate.now().plusDays(14), false));
            internalTaskRepository.save(new InternalTask("Onboard new hire", LocalDate.now().plusDays(2), false));
            internalTaskRepository.save(new InternalTask("Security review", LocalDate.now().plusWeeks(2), false));
        };
    }

}
