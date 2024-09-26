package edu.icet.crm.dao.guardian;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "guardian")
public class GuardianDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long studentId;
    private String guardianName;
    private String guardianAddress;
    private String guardianContact;
}
