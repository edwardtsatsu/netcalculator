package com.netcalculator.netcalculator.service;

import com.netcalculator.netcalculator.request.StudentRequest;
import com.netcalculator.netcalculator.response.StudentResponse;

import java.util.List;

public interface StudentService {
    StudentResponse addStudent(StudentRequest studentRequest);

    List<StudentResponse> getAllStudent(String firstName);
}
