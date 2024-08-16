package org.project.sistemsekolah.akademik.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MahasiswaModel {
    private String id;
    private String kode;
    private String nama;
    private String namaDosen;
}
