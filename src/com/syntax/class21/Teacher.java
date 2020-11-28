package com.syntax.class21;

public class Teacher {
    String name;
    int experience;
    double salary;
    String degree;
    String education;
    String subject;
    Teacher() {
        this.name = name;
        this.experience = experience;
        this.degree = degree;
        this.subject = subject;
    }
    Teacher(String name, int experience, String degree, String subject, double salary, String education) {
        this( );
        this.salary = salary;
        this.education = education;
    }
    void print() {
        System.out.println("The teacher " + name + " has " + experience + " years experience of teaching and " + degree + " degree");
    }
    }

