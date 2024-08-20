package org.project.sistemsekolah.kelurahan.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class KelurahanModel {
    private String id;
    private String nama;
    private String alamat;
    private List<DusunModel> daftarDusun = new ArrayList<>();

    public KelurahanModel(String id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }

    public KelurahanModel(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public KelurahanModel() {
        this.id = UUID.randomUUID().toString();
    }
}
