package com.company.entities;

import java.time.LocalDate;

public class Mentor extends People{
    private int salary;
    public Mentor(String name, LocalDate birthDate, String phoneNumber, Module currentModule, int salary) {
        super(name, birthDate, phoneNumber, currentModule);
        this.salary = salary;
    }
}
