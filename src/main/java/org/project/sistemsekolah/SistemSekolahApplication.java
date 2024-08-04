package org.project.sistemsekolah;

import org.project.sistemsekolah.model.SchoolClassModel;
import org.project.sistemsekolah.model.SchoolHistoryModel;
import org.project.sistemsekolah.model.StudentModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SistemSekolahApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemSekolahApplication.class, args);
	}

}
