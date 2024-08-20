package org.project.sistemsekolah.kelurahan.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class DusunModel {
    private String id;
    private String name;
    private List<RWModel> daftarRW = new ArrayList<>();

    public DusunModel(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public DusunModel(String name) {
        this.name = name;
    }

    public DusunModel() {
        this.id = UUID.randomUUID().toString();
    }
}
