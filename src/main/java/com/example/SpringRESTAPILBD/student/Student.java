package com.example.SpringRESTAPILBD.student;

import com.example.SpringRESTAPILBD.teacher.Subject;

import java.util.ArrayList;

public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private ArrayList<Subject> subjectList;

    public Student(Long id, String firstName, String lastName, int age, ArrayList<Subject> subjectList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.subjectList = subjectList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", subjectList=" + subjectList +
                '}';
    }
}
