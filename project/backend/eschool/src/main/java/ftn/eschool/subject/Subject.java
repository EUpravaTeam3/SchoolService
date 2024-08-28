package ftn.eschool.subject;
import ftn.eschool.syllabus.Syllabus;
import ftn.eschool.mark.Mark;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Set;

// lombok
@RequiredArgsConstructor
@Data

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "syllabus_id")
    private Syllabus syllabus;

    @ToString.Exclude
    @OneToMany(mappedBy = "subject")
    private Set<Mark> marks;

    private String name;

}
