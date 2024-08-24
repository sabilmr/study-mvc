package org.project.sistemsekolah.kelurahan.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class RWModel {
    private String  id;
    private String name;
    private String nameRW;
    private List<RTModel> daftarRT = new ArrayList<>();

    public RWModel(String id, String name, String nameRW) {
        this.id = id;
        this.name = name;
        this.nameRW = nameRW;
    }

    public RWModel(String name, String nameRW) {
        this.name = name;
        this.nameRW = nameRW;
    }

    public RWModel() {
        this.id = UUID.randomUUID().toString();
    }
}
