package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    // we have to have a bean in here
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student lwinHtet = new Student(
                    "Lwin Htet",
                    "lwinht@gmail.com",
                    LocalDate.of(
                            1997,
                            JANUARY,
                            8
                    )
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(
                            2004,
                            JANUARY,
                            8
                    )
            );

            repository.saveAll(List.of(lwinHtet, alex));
        };
    }
}
