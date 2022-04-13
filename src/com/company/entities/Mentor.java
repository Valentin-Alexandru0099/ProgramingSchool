package com.company.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mentor extends People{
    private int salary;
    private List<Language> languages;

    public Mentor(String name, LocalDate birthDate, String phoneNumber, Module currentModule, int salary, Language language) {
        super(name, birthDate, phoneNumber, currentModule);
        this.salary = salary;
        this.languages = new ArrayList<>();
        learnLanguage(language);
    }

    public void learnLanguage( Language language ){
        languages.add(language);
    }


    public List<Language> getLanguages() {
        return languages;
    }

}
