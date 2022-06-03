package com.netcalculator.netcalculator.service;

import com.netcalculator.netcalculator.request.StudentRequest;
import com.netcalculator.netcalculator.response.StudentResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    StudentResponse addStudent(StudentRequest studentRequest);

    List<StudentResponse> getAllStudentByIndexNumber(String indexNumber);

    List<StudentResponse> getAllStudents();
}
