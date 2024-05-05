package ftn.eschool.entities;

import ftn.eschool.entities.enums.SchoolType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

// lombok
@RequiredArgsConstructor
@Data

@Entity
public class FinalExam {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    private String name;

    private Integer markValue;

    @Enumerated(EnumType.STRING)
    private SchoolType schoolType;

    private LocalDate dateTaken;
}
