package org.project.sistemsekolah.kelurahan.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class RTModel {
    private String id;
    private String name;
    private String nameRT;
    List<WargaModel> daftarWarga = new ArrayList<>();

    public RTModel(String id, String name, String nameRT) {
        this.id = id;
        this.name = name;
        this.nameRT = nameRT;
    }

    public RTModel(String name, String nameRT) {
        this.name = name;
        this.nameRT = nameRT;
    }

    public RTModel() {
        this.id = UUID.randomUUID().toString();
    }
}
