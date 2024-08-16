package org.project.sistemsekolah.akademik.service;

import org.project.sistemsekolah.akademik.model.FakultasModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FakultasServiceImpl implements FakultasService{
    @Override
    public List<FakultasModel> get() {
        return List.of();
    }

    @Override
    public Optional<FakultasModel> getById(Integer id) {
        return Optional.empty();
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
