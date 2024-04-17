package ftn.eschool.entities;


import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

// lombok
@RequiredArgsConstructor
@Data

@Entity
public class EducationalSpecialization {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    // Duration in years 8, 4, 3
    private Integer duration;

    private List<School> schools;
}
