package ftn.eschool.users;
import ftn.eschool.mark.Mark;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)

@Entity
public class Professor extends Person {

    @OneToMany(mappedBy = "professor")
    private Set<Mark> marks;

}
