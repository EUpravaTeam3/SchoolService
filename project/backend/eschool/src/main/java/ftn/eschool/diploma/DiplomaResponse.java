package ftn.eschool.diploma;

import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class DiplomaResponse {

    private String firstName;
    private String lastName;
    private String UCN;
    private Set<SchoolYearResponse> elementarySchoolYears;
    private Set<SchoolYearResponse> highSchoolYears;

    @Data
    private class SchoolYearResponse {
        private LocalDate date;
        private Set<SubjectResponse> subjects;
        private Double averageMark;
    }

    @Data
    private class SubjectResponse {
        private String name;
        private String markValue;
    }
}


