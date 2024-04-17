package ftn.eschool.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.util.Set;
import java.util.UUID;

// lombok
@RequiredArgsConstructor
@Data

@Entity
@Table(name = "subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private Syllabus syllabus;

    @OneToMany(mappedBy = "subject")
    private Set<Mark> marks;

    private String name;

}
