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
public class Syllabus {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private EducationalSpecialization educationalSpecialization;

    private List<Subject> subjects;

    private Integer yearOrder;

    private Integer yearOfIntroduction;

    private SchoolType schoolType;

    private List<Student> students;


}
