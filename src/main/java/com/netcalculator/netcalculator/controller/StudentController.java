package com.netcalculator.netcalculator.controller;

import com.netcalculator.netcalculator.request.StudentRequest;
import com.netcalculator.netcalculator.response.StudentResponse;
import com.netcalculator.netcalculator.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<StudentResponse> addStudent(@RequestBody StudentRequest studentRequest) {
        return new ResponseEntity<>(studentService.addStudent(studentRequest), HttpStatus.CREATED);
    }

    @GetMapping("/student-indexNumber/{indexNumber}")
    public ResponseEntity<List<StudentResponse>> getAllStudentByIndexNumber(@PathVariable String indexNumber) {
        return new ResponseEntity<>(studentService.getAllStudentByIndexNumber(indexNumber), HttpStatus.FOUND);
    }

    @GetMapping("/student")
    public ResponseEntity<List<StudentResponse>> getAllStudents() {
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.FOUND);
    }
}