package edu.icet.crm.service;

import edu.icet.crm.dao.student.StudentDAO;
import edu.icet.crm.dto.student.StudentDTO;

import java.util.List;

public interface StudentService {
    void addStudent(StudentDAO student);
    List<StudentDTO> getAllStudents();
}
