package org.project.sistemsekolah.kelurahan.service;

import org.project.sistemsekolah.kelurahan.modal.DusunModel;
import org.project.sistemsekolah.kelurahan.modal.KelurahanModel;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class KelurahanServiceImpl implements KelurahanService {
    private static List<KelurahanModel> kelurahan;

    public KelurahanServiceImpl() {
        kelurahan = new ArrayList<>();
    }

    @Override //digunakan untuk menunjukkan bahwa sebuah mwthod di class turunan
    public List<KelurahanModel> get() {
        if (kelurahan.isEmpty()) {
            return Collections.emptyList();
        }
        return kelurahan;
    }

    @Override
    public Optional<KelurahanModel> getById(String id) {
        Optional<KelurahanModel> kelurahanModel =kelurahan.stream().filter(k -> k.getId().equals(id)).findFirst();
        return kelurahanModel;
    }

    @Override
    public Optional<KelurahanModel> save(KelurahanModel request) {
        KelurahanModel kelurahanModel1 = new KelurahanModel();

        BeanUtils.copyProperties(request, kelurahanModel1);
        kelurahanModel1.setId(UUID.randomUUID().toString());

        kelurahan.add(kelurahanModel1);
        return Optional.of(kelurahanModel1);
    }

    @Override
    public Optional<KelurahanModel> update(String id, KelurahanModel request) {
        for (int i = 0; i < kelurahan.size(); i++) {
            if (kelurahan.get(i).getId().equals(id)) {
                kelurahan.set(i, request);
                return Optional.of(kelurahan.get(i));
            }
        }
        return Optional.empty();
    }


    @Override
    public Optional<KelurahanModel> delete(String id) {
        for (int i = 0; i < kelurahan.size(); i++) {
            if (kelurahan.get(i).getId().equals(id)) {
                kelurahan.remove(i);
                return Optional.of(kelurahan.get(i));
            }
        }
        return Optional.empty();

    }
}
