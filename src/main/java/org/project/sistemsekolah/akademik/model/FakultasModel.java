package org.project.sistemsekolah.akademik.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class FakultasModel {
    private String id;
    private String kode;
    private String nama;
    private List<JurusanModel> jurusan = new ArrayList<>();

    public int jumlahJurusan(){
        return jurusan.size();
    }

    public FakultasModel(String id, String kode, String nama) {
        this.id = id;
        this.kode = kode;
        this.nama = nama;
    }

    public FakultasModel(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public FakultasModel() {
        this.id = UUID.randomUUID().toString();
    }
}
