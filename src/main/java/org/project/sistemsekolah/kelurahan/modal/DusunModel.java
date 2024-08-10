package org.project.sistemsekolah.kelurahan.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DusunModel {
    private Integer id;
    private String name;
    private List<RWModel> daftarRW = new ArrayList<>();

    public DusunModel(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
