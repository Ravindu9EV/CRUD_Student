package edu.icet.crm.dto.guardian;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class GuardianDTO {
    private String guardianName;
    private String guardianAddress;
    private String guardianContact;
}
