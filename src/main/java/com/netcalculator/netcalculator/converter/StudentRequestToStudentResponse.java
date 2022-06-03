package com.netcalculator.netcalculator.converter;

import com.netcalculator.netcalculator.request.StudentRequest;
import com.netcalculator.netcalculator.response.StudentResponse;

public class StudentRequestToStudentResponse {

    public static StudentResponse convertToStudentResponse(StudentRequest studentRequest) {
      return  StudentResponse.builder()
                       .faculty(studentRequest.getFaculty())
                       .firstName(studentRequest.getFirstName())
                       .studentLevel(studentRequest.getStudentLevel())
                       .indexNumber(studentRequest.getIndexNumber())
                       .lastName(studentRequest.getLastName())
                       .build();
    }
}
