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
        if (mentor.getCurrentModule().equals(module)){
            mentor.setCurrentModule(module);
            System.out.println("Can teach: " + module);
        }else{
            System.out.println("Can't teach: " + module);

        }
    }
}
