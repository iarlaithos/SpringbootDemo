package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student iarlaith = new Student(
                    "Iarlaith",
                    "ios@gmail.com",
                    LocalDate.of(2001, Month.FEBRUARY, 2)
            );

            Student steve = new Student(
                    "Steve",
                    "steve@gmail.com",
                    LocalDate.of(1983, Month.JANUARY, 22)
            );

            repository.saveAll(
                    List.of(iarlaith,steve)
            );
        };
    }
}
