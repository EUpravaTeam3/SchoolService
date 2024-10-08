package ftn.eschool.educationalspecialization;
import ftn.eschool.school.School;
import ftn.eschool.syllabus.Syllabus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Set;

// lombok
@RequiredArgsConstructor
@Data
@Entity
public class EducationalSpecialization {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;


    // Duration in years 8, 4, 3
    @Enumerated(EnumType.STRING)
    private SpecializationDuration duration;

    @ManyToOne
    @JoinColumn(name = "school_id", nullable = false)
    private School school;

    @ToString.Exclude
    @OneToMany(mappedBy = "educationalSpecialization")
    private Set<Syllabus> syllabi;
}
