package org.project.sistemsekolah.v2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KelurahanModelV2 {
    private Integer id;
    private String nama;
    private String alamat;
    private List<DusunModelV2> daftarDusun = new ArrayList<>();

    public KelurahanModelV2(Integer id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }
}
