package edu.icet.crm.dto.student;



import lombok.*;




@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

    private String name;
    private Integer age;
    private String contact;

    private String password;
    private String image;


}
