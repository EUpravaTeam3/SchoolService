package ftn.eschool.mark;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public  interface MarkRepository extends JpaRepository<Mark, String> {

    @Query(value = """
        SELECT * FROM mark
        WHERE (:#{#searchCriteria.subjectId} IS NULL OR subject_id = :#{#searchCriteria.subjectId})
        AND (:#{#searchCriteria.professorId} IS NULL OR professor_id = :#{#searchCriteria.professorId})
        AND (:#{#searchCriteria.studentId} IS NULL OR student_id = :#{#searchCriteria.studentId})
    """, nativeQuery = true)
    List<Mark> searchMarks(@Param("searchCriteria") MarkSearchCriteria searchCriteria);
}
