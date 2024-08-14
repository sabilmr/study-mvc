package org.project.sistemsekolah.kelurahan.v2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RTModelV2 {
    private Integer id;
    private String name;
    private String nameRt;
    private RWModelV2 rw;
    private DusunModelV2 dusun;
    private KelurahanModelV2 kelurahan;
    List<WargaModelV2> daftarWarga = new ArrayList<>();

    public RTModelV2(Integer id, String name, String nameRt, RWModelV2 rw, DusunModelV2 dusun, KelurahanModelV2 kelurahan) {
        this.id = id;
        this.name = name;
        this.nameRt = nameRt;
        this.rw = rw;
        this.dusun = dusun;
        this.kelurahan = kelurahan;
    }

    public RTModelV2(Integer id, String name, String nameRt, List<WargaModelV2> daftarWarga) {
        this.id = id;
        this.name = name;
        this.nameRt = nameRt;
        this.daftarWarga = daftarWarga;
    }
}