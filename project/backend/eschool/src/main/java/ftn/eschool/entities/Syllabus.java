package ftn.eschool.entities;

import ftn.eschool.entities.enums.SchoolType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Set;
import java.util.UUID;

// lombok
@RequiredArgsConstructor
@Data

@Entity
public class Syllabus {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "educational_specialization_id", nullable = false)
    private EducationalSpecialization educationalSpecialization;

    @OneToMany(mappedBy = "syllabus")
    private Set<Subject> subjects;

    private Integer yearOrder;

    private Integer yearOfIntroduction;

    @ManyToMany(mappedBy = "syllabi")
    private Set<Student> students;
}
