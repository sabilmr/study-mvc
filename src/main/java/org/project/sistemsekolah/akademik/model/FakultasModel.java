package org.project.sistemsekolah.akademik.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FakultasModel {
    private Integer id;
    private String kode;
    private String nama;
    private List<JurusanModel> jurusan = new ArrayList<>();

    public int jumlahJurusan(){
        return jurusan.size();
    }

    public FakultasModel(Integer id, String kode, String nama) {
        this.id = id;
        this.kode = kode;
        this.nama = nama;
    }
}
