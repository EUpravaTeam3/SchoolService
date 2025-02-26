package ftn.eschool.mark;


import ftn.eschool.subject.Subject;
import ftn.eschool.users.Professor;
import ftn.eschool.users.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MarkMapper {

    public List<MarkResponse> toMarkResponse(List<Mark> marks) {
        return marks.stream().map(mark -> toMarkResponse(mark)).collect(Collectors.toList());
    }

    public MarkResponse toMarkResponse(Mark mark) {
        Subject subject = mark.getSubject();
        Professor professor = mark.getProfessor();
        Student student = mark.getStudent();

        return new MarkResponse(
                mark.getId(),
                new SubjectResponse(subject.getId(), subject.getName()),
                new ProfessorResponse(professor.getId(), professor.getFirstName(), professor.getLastName()),
                new StudentResponse(student.getId(), student.getFirstName(), student.getLastName()),
                mark.getValue(),
                mark.getLocalDateTime());
    }
}
