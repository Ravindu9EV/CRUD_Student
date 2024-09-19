package edu.icet.crm.dto;



import lombok.*;




@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
   private String image;
    private String name;
    private Integer age;
    private String contact;

    private String password;


}
