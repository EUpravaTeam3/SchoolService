package ftn.eschool.studentsyllabus;

import ftn.eschool.syllabus.Syllabus;
import ftn.eschool.users.Student;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

// lombok
@RequiredArgsConstructor
@Data
@EqualsAndHashCode(of = {"id"})

@Entity
public class StudentSyllabus {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "syllabus_id", nullable = false)
    private Syllabus syllabus;

    @Enumerated(EnumType.STRING)
    private Semester semester;

    private Boolean finalized;
}
