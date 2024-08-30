package org.project.sistemsekolah.akademik.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class MataKuliahModel {
    private String id;
    private String code;
    private String name;
    private String dosenName;
    private String nilai;

    public MataKuliahModel(String code, String name, String dosenName, String nilai) {
        this.code = code;
        this.name = name;
        this.dosenName = dosenName;
        this.nilai = nilai;
    }

    public MataKuliahModel() {
        this.id = UUID.randomUUID().toString();
    }
}
