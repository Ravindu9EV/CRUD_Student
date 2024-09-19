package edu.icet.crm.controller;

import edu.icet.crm.dto.StudentDTO;
import edu.icet.crm.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
@CrossOrigin

public class StudentController {

    private final StudentService service;
    @PostMapping("/save-student")
    public Map<String,String> addStudent(@RequestBody StudentDTO student)  {
        student.setImage(student.getImage());
        System.out.println(student.getImage());

        System.out.println(student);
        service.addStudent(student);
        return Collections.singletonMap("Status","Student Added");
    }

    @GetMapping("/get-all-students")
    public List<StudentDTO> getAllStudents(){
        return service.getAllStudents();
    }




}
