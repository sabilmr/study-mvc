package org.project.sistemsekolah.kelurahan.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RWModel {
    private Integer id;
    private String name;
    private String nameRW;
    private List<RTModel> daftarRT = new ArrayList<>();

    public RWModel(Integer id, String name, String nameRW) {
        this.id = id;
        this.name = name;
        this.nameRW = nameRW;
    }
}
