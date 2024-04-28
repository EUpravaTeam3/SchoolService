package ftn.eschool.entities;
import jakarta.persistence.OneToMany;
import java.util.Set;


public class Professor extends Person {

    @OneToMany(mappedBy = "professor")
    private Set<Mark> marks;

}
