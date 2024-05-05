package ftn.eschool.web.dtos;

import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class DiplomaDto {

    private String firstName;
    private String lastName;
    private String UCN;
    private Set<SchoolYearDto> elementarySchoolYears;
    private Set<SchoolYearDto> highSchoolYears;

    @Data
    private class SchoolYearDto {
        private LocalDate date;
        private Set<SubjectDto> subjects;
        private Double averageMark;
    }

    @Data
    private class SubjectDto {
        private String name;
        private String markValue;
    }
}


