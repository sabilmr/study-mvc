package org.project.sistemsekolah.student.controller;

import org.project.sistemsekolah.student.model.SchoolClassModel;
import org.project.sistemsekolah.student.model.SchoolHistoryModel;
import org.project.sistemsekolah.student.model.StudentModel;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
                new SchoolHistoryModel(10,"MTS KERTAHAYU","KERTAHAYU","PAMARICAN",
                        Arrays.asList(
                                new SchoolClassModel(100,"Kelas 1", LocalDate.of(2011,5,17), LocalDate.of(2012,6,16),"Pak Sabilla MR"),
                                new SchoolClassModel(101,"Kelas 2", LocalDate.of(2012,5,17), LocalDate.of(2013,6,16),"Pak Sabilla MR"),
                                new SchoolClassModel(102,"Kelas 3", LocalDate.of(2013,5,17), LocalDate.of(2014,6,16),"Pak Sabilla MR"),
                                new SchoolClassModel(103,"Kelas 4", LocalDate.of(2014,5,17), LocalDate.of(2015,6,16),"Pak Sabilla MR"),
                                new SchoolClassModel(104,"Kelas 5", LocalDate.of(2015,5,17), LocalDate.of(2016,6,16),"Pak Sabilla MR"),
                                new SchoolClassModel(105,"Kelas 6", LocalDate.of(2016,5,17), LocalDate.of(2017,6,16),"Pak Sabilla MR")
                        )
                )
        );
        schoolHistoryModels.add(
                new SchoolHistoryModel(11,"SMP MUTHU PANDAAN","PANDAAN","PASURUAN",
                        Arrays.asList(
                                new SchoolClassModel(106,"Kelas 1", LocalDate.of(2017,6,15), LocalDate.of(2018,7,16),"Bu Ani"),
                                new SchoolClassModel(107,"Kelas 2", LocalDate.of(2018,6,15), LocalDate.of(2019,7,16),"Bu Ani"),
                                new SchoolClassModel(108,"Kelas 3", LocalDate.of(2020,6,15), LocalDate.of(2021,7,16),"Bu Ani")
                        )
                )
        );
        schoolHistoryModels.add(
                new SchoolHistoryModel(12,"SMK MEGRI 1 PAMARICAN","PAMARICAN","CIAMIS",
                        Arrays.asList(
                                new SchoolClassModel(109,"Kelas 1", LocalDate.of(2021,4,18), LocalDate.of(2022,5,17), "Pak Ahmad Dhani"),
                                new SchoolClassModel(109,"Kelas 2", LocalDate.of(2022,4,18), LocalDate.of(2023,5,17), "Pak Ahmad Dhani"),
                                new SchoolClassModel(109,"Kelas 3", LocalDate.of(2023,4,18), LocalDate.of(2024,5,17), "Pak Ahmad Dhani")
                        )
                )
        );


        StudentModel studentModel = new StudentModel(1,"Sabilla","Muhammad","Surabaya");
        studentModel.setSchoolHistory(schoolHistory);

        StudentModel student = new StudentModel(2,"Ahmad","Dhani","Ciamis");
        student.setSchoolHistory(schoolHistoryModels);

        StudentModel studentModel1 = new StudentModel(3,"Arif","Pratama","Lampung");

        StudentModel studentModel2 = new StudentModel(4,"Ikhlas","Ramadhani","Pandaan");

        StudentModel studentModel3 = new StudentModel(5,"Erika","Cahya","Gempol");

        StudentModel studentModel4 = new StudentModel(6,"Akmal","Firmansyah","Ciparakan");

        StudentModel studentModel5 = new StudentModel(7,"Ijaj","Bramasta","Blimbing");

        this.students.add(studentModel);
        this.students.add(student);
        this.students.add(studentModel1);
        this.students.add(studentModel2);
        this.students.add(studentModel3);
        this.students.add(studentModel4);
        this.students.add(studentModel5);

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

    @GetMapping("/add")
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView("pages/student/add");
        StudentModel student = new StudentModel();

        List<SchoolHistoryModel> schoolHistoryModel = new ArrayList<>();

        // SD Class
        ArrayList<SchoolClassModel> sdClass = new ArrayList<>();
        sdClass.add(new SchoolClassModel(0, "Kelas 1", null, null, ""));
        sdClass.add(new SchoolClassModel(0, "Kelas 2", null, null, ""));
        sdClass.add(new SchoolClassModel(0, "Kelas 3", null, null, ""));
        sdClass.add(new SchoolClassModel(0, "Kelas 4", null, null, ""));
        sdClass.add(new SchoolClassModel(0, "Kelas 5", null, null, ""));
        sdClass.add(new SchoolClassModel(0, "Kelas 6", null, null, ""));

        // SD
        SchoolHistoryModel sdHistory = new SchoolHistoryModel(0, "SD", "", "", sdClass);
        // add school histoty
        schoolHistoryModel.add(sdHistory);

        //SMP Class
        ArrayList<SchoolClassModel> sdClass1 = new ArrayList<>();
        sdClass1.add(new SchoolClassModel(0, "Kelas 1", null, null, ""));
        sdClass1.add(new SchoolClassModel(0, "Kelas 2", null, null, ""));
        sdClass1.add(new SchoolClassModel(0, "Kelas 3", null, null, ""));

        SchoolHistoryModel sdHistory1 = new SchoolHistoryModel(0, "SMP", "", "", sdClass1);
        schoolHistoryModel.add(sdHistory1);

        //SMK Class
        ArrayList<SchoolClassModel> sdClass2 = new ArrayList<>();
        sdClass2.add(new SchoolClassModel(0, "Kelas 1", null, null, ""));
        sdClass2.add(new SchoolClassModel(0, "Kelas 2", null, null, ""));
        sdClass2.add(new SchoolClassModel(0, "Kelas 3", null, null, ""));

        SchoolHistoryModel sdHistory2 = new SchoolHistoryModel(0, "SMK", "", "", sdClass2);
        schoolHistoryModel.add(sdHistory2);

        student.setSchoolHistory(schoolHistoryModel);

        mav.addObject("student", student);

        return mav;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("student") StudentModel student) {
        students.add(student);
        return new ModelAndView("redirect:/student");
    }
}
