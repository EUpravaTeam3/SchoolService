package ftn.eschool.syllabus;
import ftn.eschool.educationalspecialization.EducationalSpecialization;
import ftn.eschool.studentsyllabus.StudentSyllabus;
import ftn.eschool.subject.Subject;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Set;

// lombok
@RequiredArgsConstructor
@Data
@EqualsAndHashCode(of = {"id"})

@Entity
public class Syllabus {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "educational_specialization_id", nullable = false)
    private EducationalSpecialization educationalSpecialization;

    @ToString.Exclude
    @OneToMany(mappedBy = "syllabus")
    private Set<Subject> subjects;

    private Integer yearOrder;

    private Integer yearOfIntroduction;

    @ToString.Exclude
    @OneToMany(mappedBy = "syllabus")
    private Set<StudentSyllabus> studentSyllabus;

}
