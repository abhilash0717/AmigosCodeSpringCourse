package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,"Abhi", "abi@gmail.com", LocalDate.of(1997, Month.FEBRUARY, 17), 25
                ),
                new Student(
                        2L,"ABHI", "abi1@gmail.com", LocalDate.of(1996, Month.FEBRUARY, 17), 25
                )
        );
    }
}
