package org.project.sistemsekolah.kelurahan.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RTModel {
    private Integer id;
    private String name;
    private String nameRT;
    List<WargaModel> daftarWarga = new ArrayList<>();

    public RTModel(Integer id, String name, String nameRT) {
        this.id = id;
        this.name = name;
        this.nameRT = nameRT;
    }
}
