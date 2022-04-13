package com.company.entities;

import java.time.LocalDate;

public abstract class People {
    private final String name;
    private final LocalDate birthDate;
    private String phoneNumber;
    protected Module currentModule;

    public People(String name, LocalDate birthDate, String phoneNumber, Module currentModule) {
        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.currentModule = currentModule;
    }

    public Module getCurrentModule() {
        return currentModule;
    }

    public void setCurrentModule(Module currentModule) {
        this.currentModule = currentModule;
    }


    @Override
    public String toString() {
        return name+ " ";
    }
}
