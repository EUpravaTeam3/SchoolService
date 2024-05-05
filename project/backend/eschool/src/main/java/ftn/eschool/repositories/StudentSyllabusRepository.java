package ftn.eschool.repositories;

import ftn.eschool.entities.StudentSyllabus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentSyllabusRepository extends JpaRepository<StudentSyllabus, String> {

    List<StudentSyllabus> findAllByStudentId(String studentId);
}
