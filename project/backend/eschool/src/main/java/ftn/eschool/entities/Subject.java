package ftn.eschool.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
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

    private Syllabus syllabus;

    private List<Mark> marks;

    private String name;

}
