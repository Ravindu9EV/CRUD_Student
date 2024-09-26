package edu.icet.crm.controller;

import edu.icet.crm.dao.guardian.GuardianDAO;
import edu.icet.crm.dao.student.StudentDAO;
import edu.icet.crm.dto.student.StudentDTO;
import edu.icet.crm.service.GuardianService;
import edu.icet.crm.service.StudentService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
@CrossOrigin

public class StudentController {

    private final StudentService service;

    private final GuardianService guardianService;

//    @PostMapping("/save-student")
//    public Map<String,String> addStudent(@RequestBody StudentDTO student)  {
//        student.setImage(student.getImage());
//        System.out.println(student.getImage());
//      //  String imgdata=service.encodeImagr(student.getImage(),"F:\\ICET\\EnterPriseLevel\\Assignment\\StudentManagementSystem\\src\\main\\resources\\images\\");
//       // student.setImage(imgdata);
//        System.out.println(student);
//        service.addStudent(student);
//        return Collections.singletonMap("Status","Student Added");
//    }

    @GetMapping("/get-all-students")
    public List<StudentDTO> getAllStudents(){
        return service.getAllStudents();
    }

    @PostMapping("/save-student")
    public Map<String,String> saveStudent(@RequestBody @RequestParam("name") String name,@RequestParam("age") int age,@RequestParam("contact") String contact,@RequestParam("password") String password,@RequestParam("image") MultipartFile image,@RequestParam("guardian_name") String guardianName,@RequestParam("guardian_address")String guardianAddress,@RequestParam("guardian_contact") String guardianContact) throws IOException {
        StudentDAO std=new StudentDAO();
        std.setName(name);
        std.setAge(age);
        std.setContact(contact);
        std.setPassword(password);
        std.setImage(image.getBytes());

        GuardianDAO grd=new GuardianDAO();
        grd.setStudentId(std.getId());
        grd.setGuardianName(guardianName);
        grd.setGuardianAddress(guardianAddress);
        grd.setGuardianContact(guardianContact);
        service.addStudent(std);
        guardianService.addGuardian(grd);
        return Collections.singletonMap("Status","Student Added");
    }






}
