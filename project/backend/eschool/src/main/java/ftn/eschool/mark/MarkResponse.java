package ftn.eschool.mark;

import java.time.LocalDateTime;

public record MarkResponse(
        String id,
        SubjectResponse subject,
        ProfessorResponse professor,
        StudentResponse student,
        Integer value,
        LocalDateTime localDateTime
) {
}

record SubjectResponse(
        String id,
        String subjectName
) {
}

record ProfessorResponse(
        String id,
        String firstName,
        String lastName
) {
}

record StudentResponse(
        String id,
        String firstName,
        String lastName
) {
}
