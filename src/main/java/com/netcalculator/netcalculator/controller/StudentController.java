package com.netcalculator.netcalculator.controller;

import com.netcalculator.netcalculator.request.StudentRequest;
import com.netcalculator.netcalculator.response.StudentResponse;
import com.netcalculator.netcalculator.service.impl.StudentServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private final StudentServiceImpl studentServiceImpl;

    public StudentController(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }

    @PostMapping()
    public ResponseEntity<StudentResponse> addStudent(@RequestBody StudentRequest studentRequest) {
        return new ResponseEntity<>(studentServiceImpl.addStudent(studentRequest), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<StudentResponse>> getAllStudent(@RequestParam String firstName) {
        return new ResponseEntity<>(studentServiceImpl.getAllStudent(firstName), HttpStatus.OK);
    }
}