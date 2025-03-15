package ftn.eschool.mark;

public record SaveMarkRequest(
    String subjectId,
    String professorId,
    String studentId,
    Integer value
) {
}
