package org.project.sistemsekolah.v2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DusunModelV2 {
    private Integer id;
    private String name;
    private KelurahanModelV2 kelurahan;
    private List<RWModelV2> daftarRW = new ArrayList<>();

    public DusunModelV2(Integer id, String name, KelurahanModelV2 kelurahan) {
        this.id = id;
        this.name = name;
        this.kelurahan = kelurahan;
    }
}
