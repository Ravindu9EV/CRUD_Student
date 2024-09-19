package edu.icet.crm.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.repository.student.StudentRepository;
import edu.icet.crm.dao.student.StudentDAO;
import edu.icet.crm.dto.StudentDTO;
import edu.icet.crm.service.StudentService;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {


    private final StudentRepository repository;

    @Autowired
    private ObjectMapper mapper;

    @Override
    public void addStudent(StudentDTO student) {

        repository.save(mapper.convertValue(student,StudentDAO.class));
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        List<StudentDTO> studentList=new ArrayList<>();
        for(StudentDAO std:repository.findAll()){

            studentList.add(mapper.convertValue(std, StudentDTO.class));

        }
        return studentList;
    }


}
