package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/*
 * We have Service as Service layer
 * */
@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Lwin Htet",
                        "lwinht@gmail.com",
                        26,
                        LocalDate.of(
                                1997,
                                Month.JANUARY,
                                8
                        )
                ));
    }
}
