package ftn.eschool.entities;


import ftn.eschool.entities.enums.SpecializationDuration;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Set;
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
    @Enumerated(EnumType.STRING)
    private SpecializationDuration duration;

    @ManyToOne
    @JoinColumn(name = "school_id", nullable = false)
    private School school;

    @OneToMany(mappedBy = "educationalSpecialization")
    private Set<Syllabus> syllabi;
}
