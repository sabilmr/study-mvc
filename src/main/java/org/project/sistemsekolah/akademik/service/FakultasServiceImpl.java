package org.project.sistemsekolah.akademik.service;

import org.project.sistemsekolah.akademik.model.FakultasModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class FakultasServiceImpl implements FakultasService {
    private static List<FakultasModel> fakultas;

    public FakultasServiceImpl() {
        fakultas = new ArrayList<>();
    }

    @Override
    public List<FakultasModel> get() {
        if (fakultas.isEmpty()) {
            return Collections.emptyList();
        }
        return fakultas;
    }

    @Override
    public Optional<FakultasModel> getById(String id) {
        Optional<FakultasModel> fakultasModel = fakultas.stream().filter(f -> f.getId().equals(id)).findFirst();
        return fakultasModel;
    }

    @Override
    public Optional<FakultasModel> save(FakultasModel fakultasModel) {
        return Optional.empty();
    }

    @Override
    public Optional<FakultasModel> update(FakultasModel fakultasModel, Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<FakultasModel> delete(Integer id) {
        return Optional.empty();
    }
}
