package org.project.sistemsekolah.v2.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WargaModelV2 {
    private Integer id;
    private Integer nik;
    private String namaWarga;
    private String jenisKelamin;
    private Integer age;

    public WargaModelV2(Integer id, Integer nik, String namaWarga, String jenisKelamin, Integer age) {
        this.id = id;
        this.nik = nik;
        this.namaWarga = namaWarga;
        this.jenisKelamin = jenisKelamin;
        this.age = age;
    }
}
