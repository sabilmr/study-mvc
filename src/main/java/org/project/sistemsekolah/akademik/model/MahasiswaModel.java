package org.project.sistemsekolah.akademik.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class MahasiswaModel {
    private String id;
    private Integer nim;
    private String nama;
    private List<MataKuliahModel> mataKuliah = new ArrayList<>();

    public MahasiswaModel(String id, Integer nim, String nama) {
        this.id = id;
        this.nim = nim;
        this.nama = nama;
    }

    public MahasiswaModel(Integer nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public MahasiswaModel() {
        this.id = UUID.randomUUID().toString();
    }
}
