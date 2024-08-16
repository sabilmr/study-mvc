package org.project.sistemsekolah.akademik.service;

import org.project.sistemsekolah.akademik.model.FakultasModel;

import java.util.List;
import java.util.Optional;

public interface FakultasService {
    List<FakultasModel> get();
    Optional<FakultasModel> getById(Integer id);
    Optional<FakultasModel> save(FakultasModel fakultasModel);
    Optional<FakultasModel> update(FakultasModel fakultasModel, Integer id);
    Optional<FakultasModel> delete(Integer id);
}
