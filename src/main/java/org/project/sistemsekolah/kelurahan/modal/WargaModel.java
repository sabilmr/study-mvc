package org.project.sistemsekolah.kelurahan.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class WargaModel {
    private String id;
    private Integer nik;
    private String namaWarga;
    private String jenisKelamin;
    private Integer age;

    public WargaModel(String id, Integer nik, String namaWarga, String jenisKelamin, Integer age) {
        this.id = id;
        this.nik = nik;
        this.namaWarga = namaWarga;
        this.jenisKelamin = jenisKelamin;
        this.age = age;
    }

    public WargaModel(Integer nik, String namaWarga, String jenisKelamin, Integer age) {
        this.nik = nik;
        this.namaWarga = namaWarga;
        this.jenisKelamin = jenisKelamin;
        this.age = age;
    }

    public WargaModel() {
        this.id = UUID.randomUUID().toString();
    }
}
