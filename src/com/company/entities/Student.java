package com.company.entities;

import java.time.LocalDate;

public class Student extends People {

    public Student(String name, LocalDate birthDate, String phoneNumber, Module currentModule) {
        super(name, birthDate, phoneNumber, currentModule);
    }
}
