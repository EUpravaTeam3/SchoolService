package ftn.eschool.services;

import ftn.eschool.entities.Student;
import ftn.eschool.entities.StudentSyllabus;
import ftn.eschool.entities.Syllabus;
import ftn.eschool.exceptions.StudentNotFoundException;
import ftn.eschool.repositories.StudentRepository;
import ftn.eschool.repositories.StudentSyllabusRepository;
import ftn.eschool.web.dtos.DiplomaDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DiplomaService {

    private final StudentRepository studentRepository;
    private final StudentSyllabusRepository studentSyllabusRepository;

    public DiplomaDto findStudentByUCN(String ucn) {
        Student student = studentRepository
                .findByUCN(ucn)
                .orElseThrow(StudentNotFoundException::new);

        return mapDiploma(student);
    }

    private DiplomaDto mapDiploma(Student student) {

        //TODO: Check if the student even finished elementary or high school.+

        DiplomaDto diplomaDto = new DiplomaDto();
        diplomaDto.setFirstName(student.getFirstName());
        diplomaDto.setLastName(student.getLastName());
        diplomaDto.setUCN(student.getUCN());

        var highSchoolYears = student
                .getStudentSyllabus()
                .stream()
                .map(StudentSyllabus::getSyllabus);



        System.out.println(highSchoolYears);

        return diplomaDto;
    }
}
