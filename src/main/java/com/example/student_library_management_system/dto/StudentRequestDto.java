package com.example.student_library_management_system.dto;

import lombok.Data;

@Data
public class StudentRequestDto {
    private String name;
    public String email;
    private String mobile;
    private int age;
    private String grade;
}
