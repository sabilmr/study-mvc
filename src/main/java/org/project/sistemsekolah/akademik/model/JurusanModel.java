package org.project.sistemsekolah.akademik.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.LifecycleState;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class JurusanModel {
    private String id;
    private String kode;
    private String name;
    List<JumlahMahasiswaModel> jumlahMahasiswa = new ArrayList<>();

    public JurusanModel(String id, String kode, String name) {
        this.id = id;
        this.kode = kode;
        this.name = name;
    }

    public JurusanModel(String kode, String name) {
        this.kode = kode;
        this.name = name;
    }

    public JurusanModel() {
        this.id = UUID.randomUUID().toString();
    }
}
