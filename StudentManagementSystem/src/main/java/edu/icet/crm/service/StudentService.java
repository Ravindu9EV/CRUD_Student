package edu.icet.crm.service;

import edu.icet.crm.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    void addStudent(StudentDTO student);
    List<StudentDTO> getAllStudents();


}
