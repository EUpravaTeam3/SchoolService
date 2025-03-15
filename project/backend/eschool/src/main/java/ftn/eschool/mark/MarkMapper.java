package ftn.eschool.mark;


import ftn.eschool.professor.ProfessorRepository;
import ftn.eschool.repositories.StudentRepository;
import ftn.eschool.subject.Subject;
import ftn.eschool.subject.SubjectRepository;
import ftn.eschool.users.Professor;
import ftn.eschool.users.Student;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Validated
@Service
public class MarkMapper {

    private final SubjectRepository subjectRepository;
    private final ProfessorRepository professorRepository;
    private final StudentRepository studentRepository;

    public List<MarkResponse> toMarkResponse(List<Mark> marks) {
        return marks.stream().map(this::toMarkResponse).collect(Collectors.toList());
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


    public Mark toMark(@NotNull(message = "Request cannot be null") @Valid SaveMarkRequest saveMarkRequest) {
        Subject subject = subjectRepository.findById(saveMarkRequest.subjectId()).orElseThrow(
                () -> new EntityNotFoundException("Subject with ID " + saveMarkRequest.subjectId() + " not found"));
        Professor professor = professorRepository.findById(saveMarkRequest.professorId()).orElseThrow(
                () -> new EntityNotFoundException("Professor with ID " + saveMarkRequest.professorId() + " not found"));
        Student student = studentRepository.findById(saveMarkRequest.studentId()).orElseThrow(
                () -> new EntityNotFoundException("Student with ID " + saveMarkRequest.studentId() + " not found"));

        Mark mark = new Mark();
        mark.setSubject(subject);
        mark.setProfessor(professor);
        mark.setStudent(student);
        mark.setValue(saveMarkRequest.value());
        mark.setLocalDateTime(LocalDateTime.now());

        return mark;
    }
}
