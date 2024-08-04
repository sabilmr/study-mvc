package org.project.sistemsekolah.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchoolClassModel {
    private int id;
    private String schoolClass;
    private LocalDate startDate;
    private LocalDate endDate;
    private String teacherName;


}

