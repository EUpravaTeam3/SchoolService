package ftn.eschool.entities;
import ftn.eschool.entities.enums.SchoolType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.util.Set;

// lombok
@RequiredArgsConstructor
@Data

@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    @Enumerated(EnumType.STRING)
    private SchoolType type;

    @OneToMany(mappedBy = "school")
    private Set<EducationalSpecialization> educationalSpecializations;
}
