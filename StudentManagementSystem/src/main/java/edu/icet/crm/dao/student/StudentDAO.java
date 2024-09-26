package edu.icet.crm.dao.student;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
@Entity
@Table (name = "student")
public class StudentDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;


    private String name;
    private Integer age;
    private String contact;
    private String password;

    @Lob
    @Column(name="image", columnDefinition = "MEDIUMBLOB")
    private byte[] image;


}
