package org.project.sistemsekolah.student.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchoolHistoryModel {
    private int id;
    private String schoolName;
    private String schoolAddress;
    private String schoolCity;
    private List<SchoolClassModel> schoolClasses = new ArrayList<>();
}
