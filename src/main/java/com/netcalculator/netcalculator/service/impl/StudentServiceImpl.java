package com.netcalculator.netcalculator.service.impl;

import com.netcalculator.netcalculator.converter.StudentRequestToStudentResponse;
import com.netcalculator.netcalculator.exception.StudentNotFoundException;
import com.netcalculator.netcalculator.request.StudentRequest;
import com.netcalculator.netcalculator.response.StudentResponse;
import com.netcalculator.netcalculator.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {
    List<StudentResponse> studentDB = new ArrayList<>();

    public StudentResponse addStudent(StudentRequest studentRequest) {
        StudentResponse studentResponse = StudentRequestToStudentResponse.convertToStudentResponse(studentRequest);
        studentDB.add(studentResponse);
        return studentResponse;
    }


    public List<StudentResponse> getAllStudentByIndexNumber(String indexNumber) {
        Optional<StudentResponse> studentIndexNumber = studentDB.stream().filter(x -> x.getIndexNumber().equals(indexNumber)).findFirst();


        if (studentIndexNumber.isEmpty()) {
            throw new StudentNotFoundException("student with name " + indexNumber + " not found");
        }
        return studentIndexNumber.stream().toList();
    }

    @Override
    public List<StudentResponse> getAllStudents() {
        return studentDB;
    }
}