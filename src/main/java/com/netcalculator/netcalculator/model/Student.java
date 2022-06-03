package com.netcalculator.netcalculator.model;

import lombok.Data;

@Data
public class Student {
    private String firstName;
    private String lastName;
    private Faculty faculty;
    private StudentLevel studentLevel;
    private String indexNumber;

    public Student(StudentLevel studentLevel, Faculty faculty, String indexNumber, String firstName, String lastName) {


    }
}