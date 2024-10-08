package org.project.sistemsekolah.kelurahan.v2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RWModelV2 {
    private Integer id;
    private String name;
    private String nameRW;
    private DusunModelV2 dusun;
    private KelurahanModelV2 kelurahan;
    private List<RTModelV2> daftarRT = new ArrayList<>();

    public RWModelV2(Integer id, String name, String nameRW, DusunModelV2 dusunV2, KelurahanModelV2 kelurahanV2) {
        this.id = id;
        this.name = name;
        this.nameRW = nameRW;
        this.dusun = dusunV2;
        this.kelurahan = kelurahanV2;
    }

    public RWModelV2(Integer id, String name, String nameRW, List<RTModelV2> daftarRT) {
        this.id = id;
        this.name = name;
        this.nameRW = nameRW;
        this.daftarRT = daftarRT;
    }
}
