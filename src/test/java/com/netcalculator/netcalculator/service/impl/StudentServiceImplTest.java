package com.netcalculator.netcalculator.service.impl;

import com.netcalculator.netcalculator.model.Faculty;
import com.netcalculator.netcalculator.model.StudentLevel;
import com.netcalculator.netcalculator.request.StudentRequest;
import com.netcalculator.netcalculator.response.StudentResponse;
import com.netcalculator.netcalculator.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceImplTest {
    private StudentService studentService;
    private StudentRequest studentRequest;
    private StudentResponse studentResponse;

    @BeforeEach
    void setUp() {
        studentService = new StudentServiceImpl();
        studentRequest = StudentRequest.builder()
                .faculty(Faculty.ENGINEERING)
                .firstName("edward")
                .indexNumber("040917125")
                .studentLevel(StudentLevel.L100)
                .lastName("Akorlie")
                .build();

        studentResponse = StudentResponse.builder()
                                       .faculty(Faculty.ENGINEERING)
                                       .firstName("edward")
                                       .indexNumber("040917125")
                                       .studentLevel(StudentLevel.L100)
                                       .lastName("Akorlie")
                                       .build();
    }

    @Test
    void shouldAddStudentTest() {
        assertEquals(studentResponse, studentService.addStudent(studentRequest));
    }
}