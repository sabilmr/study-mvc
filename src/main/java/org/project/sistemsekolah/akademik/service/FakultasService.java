package org.project.sistemsekolah.akademik.service;

import org.project.sistemsekolah.akademik.model.FakultasModel;

import java.awt.image.BufferedImageOp;
import java.util.List;
import java.util.Optional;

public interface FakultasService {
    List<FakultasModel> get();
    Optional<FakultasModel> getById(String id);
    Optional<FakultasModel> save(FakultasModel fakultasModel);
    Optional<FakultasModel> update(FakultasModel fakultasModel, Integer id);
    Optional<FakultasModel> delete(Integer id);

}
