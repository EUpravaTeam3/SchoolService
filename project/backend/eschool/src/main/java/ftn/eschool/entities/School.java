package ftn.eschool.entities;

import ftn.eschool.entities.enums.SchoolType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

// lombok
@RequiredArgsConstructor
@Data

@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private SchoolType type;

    private List<EducationalSpecialization> educationalSpecializations;
}
