package com.netcalculator.netcalculator.request;

import com.netcalculator.netcalculator.model.Faculty;
import com.netcalculator.netcalculator.model.StudentLevel;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentRequest {
    private String firstName;
    private String lastName;
    private Faculty faculty;
    private StudentLevel studentLevel;
    private String indexNumber;
}
