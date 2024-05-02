package ftn.eschool.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

//Lombok
@Data
@EqualsAndHashCode(callSuper = true)

@Entity
public class Student extends Person {

    @ManyToMany
    @JoinTable(
            name = "syllabus_student",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "syllabus_id")
    )
    private Set<Syllabus> syllabi;

    @OneToMany(mappedBy = "student")
    private Set<Mark> marks;

    private Boolean finishedElementarySchool;

    private Boolean finishedHighSchool;


}
