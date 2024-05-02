package ftn.eschool.entities;
import ftn.eschool.entities.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String firstName;
    private String lastName;
    private LocalDateTime dateOfBirth;
    private String phoneNumber;
    private String UCN;

}
