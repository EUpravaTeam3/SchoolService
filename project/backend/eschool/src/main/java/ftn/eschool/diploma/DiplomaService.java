package ftn.eschool.diploma;

import ftn.eschool.users.Student;
import ftn.eschool.studentsyllabus.StudentSyllabus;
import ftn.eschool.exceptions.StudentNotFoundException;
import ftn.eschool.repositories.StudentRepository;
import ftn.eschool.repositories.StudentSyllabusRepository;
import ftn.eschool.diploma.DiplomaResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DiplomaService {

    private final StudentRepository studentRepository;
    private final StudentSyllabusRepository studentSyllabusRepository;

    public DiplomaResponse findStudentByUCN(String ucn) {
        Student student = studentRepository
                .findByUCN(ucn)
                .orElseThrow(StudentNotFoundException::new);

        return mapDiploma(student);
    }

    private DiplomaResponse mapDiploma(Student student) {

        //TODO: Check if the student even finished elementary or high school.+

        DiplomaResponse diplomaResponse = new DiplomaResponse();
        diplomaResponse.setFirstName(student.getFirstName());
        diplomaResponse.setLastName(student.getLastName());
        diplomaResponse.setUCN(student.getUCN());

        var highSchoolYears = student
                .getStudentSyllabus()
                .stream()
                .map(StudentSyllabus::getSyllabus);

        System.out.println(highSchoolYears);

        return diplomaResponse;
    }
}
