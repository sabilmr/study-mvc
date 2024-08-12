package org.project.sistemsekolah.kelurahan.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KelurahanModel {
    private Integer id;
    private String nama;
    private String alamat;
    private List<DusunModel> daftarDusun = new ArrayList<>();

    public KelurahanModel(Integer id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }
}