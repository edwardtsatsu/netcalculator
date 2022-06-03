package com.netcalculator.netcalculator.service.impl;

import com.netcalculator.netcalculator.converter.StudentRequestToStudentResponse;
import com.netcalculator.netcalculator.exception.StudentNotFoundException;
import com.netcalculator.netcalculator.model.Student;
import com.netcalculator.netcalculator.request.StudentRequest;
import com.netcalculator.netcalculator.response.StudentResponse;
import com.netcalculator.netcalculator.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {
    List<StudentResponse> studentDB = new ArrayList<>();

    public StudentResponse addStudent(StudentRequest studentRequest) {
        StudentResponse studentResponse = StudentRequestToStudentResponse.convertToStudentResponse(studentRequest);
        studentDB.add(studentResponse);
        return studentResponse;
    }


    public List<StudentResponse> getAllStudent(String firstName) {
        List<StudentResponse> collect = studentDB.stream().filter(x -> x.getFirstName().equals(firstName)).collect(Collectors.toList());
        if (collect.isEmpty()){
            throw  new StudentNotFoundException("student with name "+ firstName + " not found");
        }
        return collect;
    }
}