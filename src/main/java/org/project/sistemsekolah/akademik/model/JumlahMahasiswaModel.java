package org.project.sistemsekolah.akademik.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.ArrayList;
import java.util.UUID;


@Data
@AllArgsConstructor
public class JumlahMahasiswaModel {
    private String id;
    private Integer tahun;
    private List<MahasiswaModel> mahasiswa = new ArrayList<>();

    public int getJumlahMahasiswa() {
        return mahasiswa.size();
    }

    public JumlahMahasiswaModel(String id, Integer tahun) {
        this.id = id;
        this.tahun = tahun;
    }

    public JumlahMahasiswaModel(Integer tahun) {
        this.tahun = tahun;
    }

    public JumlahMahasiswaModel() {
        this.id = UUID.randomUUID().toString();
    }
}
