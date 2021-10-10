package com.tutorial.demo.Repositories;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.tutorial.demo.Models.Student;

public class StudentRepo /* extends JpaRepository<Student, Long> */{

    public List<Student> GetAllStudents() {
        List<Student> list = List.of(
                new Student(1L, "Mos7en le blqsdqyaaali", "Mos7en@gmail.com", LocalDate.of(2000, Month.APRIL, 5), 21),
                new Student(2L, "qdsqd le blyaaali", "Mos7en@gmail.com", LocalDate.of(2000, Month.APRIL, 5), 21),
                new Student(3L, "Mosqsdq7en le blyqsdaaali", "Mos7en@gmail.com", LocalDate.of(2000, Month.APRIL, 5), 21),
                new Student(4L, "Mosqqsdq7en le blyaaqsdqali", "Mos7en@gmail.com", LocalDate.of(2000, Month.APRIL, 5), 21));
        return list;
    }

}
