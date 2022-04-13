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

    public void assignToModule(Module module){
        for (Language language : languages){
            if (language.equals(module.getProgrammingLanguage())){
                System.out.println(this + "can teach: "+ module.getProgrammingLanguage());
                this.setCurrentModule(module);
                System.out.println(this.getCurrentModule());
                return;
            }
        }
        System.out.println(this + "can't teach: "+ module.getProgrammingLanguage());
    }
}
