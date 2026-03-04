package com.vw.EmployeeProject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.vw.EmployeeProject.model.Employee;
import com.vw.EmployeeProject.repository.EmployeeRepository;
@SpringBootApplication

public class EmployeeProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeProjectApplication.class, args);
    }

    @Bean
    CommandLineRunner run(EmployeeRepository repository) {
        return args -> {
            repository.save(new Employee(null, "John", "Doe", "john.doe@corp.com", "IT"));
            repository.save(new Employee(null, "Jane", "Smith", "jane.smith@corp.com", "HR"));
        };
    }
}