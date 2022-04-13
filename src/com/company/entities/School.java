package com.company.entities;

import java.util.ArrayList;
import java.util.List;

public class School {
    private final String name;
    private List<Mentor> mentors;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.mentors = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void hireMentor(Mentor mentor){
        mentors.add(mentor);

    }
    public void acceptStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudents(Module module){
        List<Student> studentList = new ArrayList<>();
        for (Student student : students){
            if ( student.getCurrentModule ().equals(module)){
                studentList.add(student);
            }
        }
        return studentList;
    }

    public void assignMentor(Mentor mentor, Module module){
        for (Language language : mentor.getLanguages()){
            if (language.equals(module.getProgrammingLanguage())){
                System.out.println(mentor + "can teach: "+ module.getProgrammingLanguage());
                mentor.setCurrentModule(module);
                System.out.println(mentor.getCurrentModule());
                return;
            }
        }
        System.out.println(mentor + "can't teach: "+ module.getProgrammingLanguage());

    }
}
