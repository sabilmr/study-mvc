package org.project.sistemsekolah.controller;

import lombok.RequiredArgsConstructor;
import org.project.sistemsekolah.model.SchoolClassModel;
import org.project.sistemsekolah.model.SchoolHistoryModel;
import org.project.sistemsekolah.model.StudentModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/student")
public class StudentController {
    private final List<StudentModel> students;

    // constructor
    public StudentController(List<StudentModel> students) {
        this.students = new ArrayList<>();
        List<SchoolHistoryModel> schoolHistory = new ArrayList<>();
        schoolHistory.add(
                new SchoolHistoryModel(10, "SDN SEBANI 1","DESA SEBANI","PANDAAN",
                        Arrays.asList(
                                new SchoolClassModel(100, "Kelas 1", LocalDate.of(2010,6,18), LocalDate.of(2011, 7, 20), "Bu Erika"),
                                new SchoolClassModel(101, "Kelas 2", LocalDate.of(2011,6,18), LocalDate.of(2012, 7, 20), "Bu Erika"),
                                new SchoolClassModel(102, "Kelas 3", LocalDate.of(2012,6,18), LocalDate.of(2013, 7, 20), "Bu Erika"),
                                new SchoolClassModel(103, "Kelas 4", LocalDate.of(2013,6,18), LocalDate.of(2014, 7, 20), "Bu Erika"),
                                new SchoolClassModel(104, "Kelas 5", LocalDate.of(2014,6,18), LocalDate.of(2015, 7, 20), "Bu Erika"),
                                new SchoolClassModel(105, "Kelas 6", LocalDate.of(2015,6,18), LocalDate.of(2016, 7, 20), "Bu Erika")
                        )

                )
        );
        schoolHistory.add(
                new SchoolHistoryModel(11,"SMP NEGRI 2 BEJI","KECAMATAN BEJI","BEJI",
                        Arrays.asList(
                                new SchoolClassModel(106, "Kelas 1", LocalDate.of(2016,6,18), LocalDate.of(2017, 7, 20), "Pak Roni Purwanto"),
                                new SchoolClassModel(107, "Kelas 2", LocalDate.of(2017,6,18), LocalDate.of(2018, 7, 20), "Pak Roni Purwanto"),
                                new SchoolClassModel(108, "Kelas 3", LocalDate.of(2018,6,18), LocalDate.of(2019, 7, 20), "Pak Roni Purwanto")
                        )
                )
        );
        schoolHistory.add(
                new SchoolHistoryModel(12, "SMK TEKSTIL PANDAAN", "KECAMATAN PANDAAN","PANDAAN",
                        Arrays.asList(
                                new SchoolClassModel(109, "Kelas 1", LocalDate.of(2017,6,18), LocalDate.of(2018, 7, 20), "Bu Saebah"),
                                new SchoolClassModel(110, "Kelas 2", LocalDate.of(2018,6,18), LocalDate.of(2019, 7, 20), "Bu Saebah"),
                                new SchoolClassModel(111, "Kelas 3", LocalDate.of(2020,6,18), LocalDate.of(2021, 7, 20), "Bu Saebah")
                        )
                )
        );


        List<SchoolHistoryModel> schoolHistoryModels = new ArrayList<>();
        schoolHistoryModels.add(
                new SchoolHistoryModel(1,"SDN BANJARSARI 2","BANJARSARI","BANJAR",
                        Arrays.asList(
                                new SchoolClassModel(100, "Kelas 1", LocalDate.of(2010,6,18), LocalDate.of(2011, 7, 20), "Bu Ani"),
                                new SchoolClassModel(101, "Kelas 2", LocalDate.of(2011,6,18), LocalDate.of(2012, 7, 20), "Bu Ani"),
                                new SchoolClassModel(102, "Kelas 3", LocalDate.of(2012,6,18), LocalDate.of(2013, 7, 20), "Bu Ani"),
                                new SchoolClassModel(103, "Kelas 4", LocalDate.of(2013,6,18), LocalDate.of(2014, 7, 20), "Bu Ani"),
                                new SchoolClassModel(104, "Kelas 5", LocalDate.of(2014,6,18), LocalDate.of(2015, 7, 20), "Bu Ani"),
                                new SchoolClassModel(105, "Kelas 6", LocalDate.of(2015,6,18), LocalDate.of(2016, 7, 20), "Bu Ani")
                        )
                )
        );
        schoolHistoryModels.add(
                new SchoolHistoryModel(2,"SMP PAMARICAN 2","PAMARICAN","CIAMIS",
                        Arrays.asList(
                                new SchoolClassModel(106, "Kelas 1", LocalDate.of(2016,6,18), LocalDate.of(2017, 7, 20), "Pak Sabilla MR"),
                                new SchoolClassModel(107, "Kelas 2", LocalDate.of(2017,6,18), LocalDate.of(2018, 7, 20), "Pak Sabilla MR"),
                                new SchoolClassModel(108, "Kelas 3", LocalDate.of(2018,6,18), LocalDate.of(2019, 7, 20), "Pak Sabilla MR")
                        )
                )
        );
        schoolHistoryModels.add(
                new SchoolHistoryModel(3,"SMK KERTAHAYU","KERTAHAYU","PAMARICAN",
                        Arrays.asList(
                                new SchoolClassModel(109, "Kelas 1", LocalDate.of(2017,6,18), LocalDate.of(2018, 7, 20), "Pak Arif Budianto"),
                                new SchoolClassModel(110, "Kelas 2", LocalDate.of(2018,6,18), LocalDate.of(2019, 7, 20), "Pak Arif Budianto"),
                                new SchoolClassModel(111, "Kelas 3", LocalDate.of(2020,6,18), LocalDate.of(2021, 7, 20), "Pak Arif Budianto")
                        )
                )
        );
        List<SchoolHistoryModel> schoolHistoryModels2 = new ArrayList<>();
        schoolHistoryModels2.add(
                new SchoolHistoryModel(1,"SD NEGRI 1","KOTAGAJAH","KOTAGAJA",
                        Arrays.asList(
                                new SchoolClassModel(100, "Kelas 1", LocalDate.of(2010,6,18), LocalDate.of(2011, 7, 20), "Bu Umul"),
                                new SchoolClassModel(101, "Kelas 2", LocalDate.of(2011,6,18), LocalDate.of(2012, 7, 20), "Bu Umul"),
                                new SchoolClassModel(102, "Kelas 3", LocalDate.of(2012,6,18), LocalDate.of(2013, 7, 20), "Bu Umul"),
                                new SchoolClassModel(103, "Kelas 4", LocalDate.of(2013,6,18), LocalDate.of(2014, 7, 20), "Bu Umul"),
                                new SchoolClassModel(104, "Kelas 5", LocalDate.of(2014,6,18), LocalDate.of(2015, 7, 20), "Bu Umul"),
                                new SchoolClassModel(105, "Kelas 6", LocalDate.of(2015,6,18), LocalDate.of(2016, 7, 20), "Bu Umul")
                        )
                )
        );
        schoolHistoryModels2.add(
                new SchoolHistoryModel(2,"SMP KOTA GAJAH","KOTAGAJAH","LAMPUNG",
                        Arrays.asList(
                                new SchoolClassModel(106, "Kelas 1", LocalDate.of(2016,6,18), LocalDate.of(2017, 7, 20), "Pak Dani"),
                                new SchoolClassModel(107, "Kelas 2", LocalDate.of(2017,6,18), LocalDate.of(2018, 7, 20), "Pak Daani"),
                                new SchoolClassModel(108, "Kelas 3", LocalDate.of(2018,6,18), LocalDate.of(2019, 7, 20), "Pak Dani")
                        )
                )
        );
        schoolHistoryModels2.add(
                new SchoolHistoryModel(3,"SMA LAMPUNG","LAMPUNG","LAMPUNG",
                        Arrays.asList(
                                 new SchoolClassModel(109, "Kelas 1", LocalDate.of(2017,6,18), LocalDate.of(2018, 7, 20), "Bu Umi"),
                                new SchoolClassModel(110, "Kelas 2", LocalDate.of(2018,6,18), LocalDate.of(2019, 7, 20), "Bu Umi"),
                                new SchoolClassModel(111, "Kelas 3", LocalDate.of(2020,6,18), LocalDate.of(2021, 7, 20), "Bu Umi")
                        )
                )
        );
        StudentModel studentModel = new StudentModel(1,"Sabilla","Muhammad","Surabaya");
        studentModel.setSchoolHistory(schoolHistory);

        StudentModel student = new StudentModel(2,"Ahmad","Dhani","Ciamis");
        student.setSchoolHistory(schoolHistoryModels);

        StudentModel studentModel1 = new StudentModel(3,"Arif","Pratama","Lampung");
        studentModel1.setSchoolHistory(schoolHistoryModels2);
        // generate data
        this.students.add(studentModel);
        this.students.add(student);
        this.students.add(studentModel1);
        this.students.add(new StudentModel(4,"Ikhlas","Ramadhani","Pandaan"));
        this.students.add(new StudentModel(5,"Erika","Cahya","Gempol"));

    }


    @GetMapping
    public ModelAndView list() {
        ModelAndView mav = new ModelAndView("pages/student/index");

        mav.addObject("student", students);
        return mav;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView mav = new ModelAndView("pages/student/detail");

        Optional<StudentModel> detail = students.stream().filter(x -> x.getId() == id).findFirst();
        if (detail.isPresent()) {
            mav.addObject("student", detail.get());
        } else {
            return new ModelAndView("redirect:/student");
        }
        return mav;
    }
}
