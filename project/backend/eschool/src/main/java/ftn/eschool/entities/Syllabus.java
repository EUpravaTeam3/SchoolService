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
    private EducationalSpecialization educationalSpecialization;

    @OneToMany(mappedBy = "syllabus")
    private Set<Subject> subjects;

    private Integer yearOrder;

    private Integer yearOfIntroduction;

    private SchoolType schoolType;

    private Set<Student> students;

    // todo: School_EducationalSpecialization
}
