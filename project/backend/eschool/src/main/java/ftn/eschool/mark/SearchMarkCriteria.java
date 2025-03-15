package ftn.eschool.mark;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class SearchMarkCriteria {
    private String subjectId;
    private String professorId;
    private String studentId;
//    private Integer minValue;
//    private Integer maxValue;
//    private LocalDateTime fromDate;
//    private LocalDateTime toDate;
}
