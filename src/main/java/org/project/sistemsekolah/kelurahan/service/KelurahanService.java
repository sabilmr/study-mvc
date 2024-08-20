package org.project.sistemsekolah.kelurahan.service;

import org.project.sistemsekolah.kelurahan.modal.DusunModel;
import org.project.sistemsekolah.kelurahan.modal.KelurahanModel;

import java.util.List;
import java.util.Optional;

public interface KelurahanService {
    List<KelurahanModel> get();
    Optional<KelurahanModel> getById(String id);
    Optional<KelurahanModel> save(KelurahanModel request);
    Optional<KelurahanModel> update(String  id, KelurahanModel request);
    Optional<KelurahanModel> delete(String id);
}
