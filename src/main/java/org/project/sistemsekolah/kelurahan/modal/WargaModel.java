package org.project.sistemsekolah.kelurahan.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class WargaModel {
    private Integer id;
    private Integer nik;
    private String namaWarga;
    private String jenisKelamin;
    private Integer age;

    public WargaModel(Integer id, Integer nik, String namaWarga, String jenisKelamin, Integer age) {
        this.id = id;
        this.nik = nik;
        this.namaWarga = namaWarga;
        this.jenisKelamin = jenisKelamin;
        this.age = age;
    }
}
