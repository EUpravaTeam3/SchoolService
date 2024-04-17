package ftn.eschool.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

// lombok
@RequiredArgsConstructor
@Data

@Entity
public class Mark {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private Professor professor;

    @ManyToOne
    private Subject subject;

    private Student student;

    private Integer value;

    private LocalDateTime localDateTime;

    private Boolean deleted;

}
