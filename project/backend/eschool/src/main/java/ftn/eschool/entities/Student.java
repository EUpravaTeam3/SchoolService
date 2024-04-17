package ftn.eschool.entities;

import lombok.Data;

import java.util.List;

//Lombok
@Data
public class Student extends Person {


    private List<Syllabus> syllabi;
    private Boolean finishedEelementarySchool;
    private Boolean finishedHighSchool;


}
