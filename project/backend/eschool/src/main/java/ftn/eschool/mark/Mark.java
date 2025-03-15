package ftn.eschool.mark;
import ftn.eschool.subject.Subject;
import ftn.eschool.users.Professor;
import ftn.eschool.users.Student;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.time.LocalDateTime;

// lombok
@RequiredArgsConstructor
@Data

@Entity
public class Mark {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "professor_id", nullable = false)
    private Professor professor;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    private Integer value;

    private LocalDateTime localDateTime;

    private boolean deleted = false;
}
