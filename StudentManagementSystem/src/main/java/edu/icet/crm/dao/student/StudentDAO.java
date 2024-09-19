package edu.icet.crm.dao.student;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
@Entity
@Table (name = "student")
public class StudentDAO {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String image;
    private String name;
    private Integer age;
    private String contact;
    private String password;
}
