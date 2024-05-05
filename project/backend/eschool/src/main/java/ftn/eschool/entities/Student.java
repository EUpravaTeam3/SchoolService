package ftn.eschool.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Set;

//Lombok
@Data
@EqualsAndHashCode(callSuper = true)

@Entity
public class Student extends Person {

    @OneToMany(mappedBy = "student")
    private Set<Mark> marks;

    private Boolean finishedElementarySchool;

    private Boolean finishedHighSchool;

    @OneToMany(mappedBy = "student")
    private Set<FinalExam> finalExams;

    @ToString.Exclude
    @OneToMany(mappedBy = "student")
    private Set<StudentSyllabus> studentSyllabus;



}
