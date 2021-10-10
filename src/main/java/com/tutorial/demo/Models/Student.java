package com.tutorial.demo.Models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_name", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "name", nullable = false)
    private String email;

    @Column(name = "dateBirth", nullable = false)
    private LocalDate dateBirth;

    @Column(name = "age", nullable = false)
    private Integer age;

    public Student(Long id, String name, String email, LocalDate dateBirth, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateBirth = dateBirth;
        this.age = age;
    }

    public Student(String name, String email, LocalDate dateBirth, Integer age) {
        this.name = name;
        this.email = email;
        this.dateBirth = dateBirth;
        this.age = age;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getdateBirth() {
        return dateBirth;
    }

    public void setdateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [dateBirth=" + dateBirth + ", age=" + age + ", email=" + email + ", id=" + id + ", name=" + name
                + "]";
    }

}
