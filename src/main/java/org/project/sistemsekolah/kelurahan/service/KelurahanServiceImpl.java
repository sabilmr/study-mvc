package org.project.sistemsekolah.kelurahan.service;

import org.project.sistemsekolah.kelurahan.modal.*;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class KelurahanServiceImpl implements KelurahanService {
    private static List<KelurahanModel> kelurahan;

    public KelurahanServiceImpl() {
        kelurahan = new ArrayList<>();
        KelurahanModel kelurahanModel1 = new KelurahanModel(UUID.randomUUID().toString(),"DESA SEBANI","PANDAAN");

        DusunModel dusunModel1 = new DusunModel(UUID.randomUUID().toString(),"DUSUN JEDUNG");

        List<DusunModel> dusun = Arrays.asList(dusunModel1);
        kelurahanModel1.setDaftarDusun(dusun);

        RWModel rwModel1 = new RWModel(UUID.randomUUID().toString(),"RW01","PAK MUHKLIS");

        List<RWModel> rw1 = Arrays.asList(rwModel1);
        dusunModel1.setDaftarRW(rw1);

        RTModel rtModel1 = new RTModel(UUID.randomUUID().toString(),"RT07","PAK MUMUH");

        List<RTModel> rt1 = Arrays.asList(rtModel1);
        rwModel1.setDaftarRT(rt1);

        WargaModel wargaModel1 = new WargaModel(UUID.randomUUID().toString(),1234,"SABILLA MUHAMMAD RAYHAN","Pria",21);

        List<WargaModel> warga1 = Arrays.asList(wargaModel1);
        rtModel1.setDaftarWarga(warga1);

        kelurahan.add(kelurahanModel1);

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
                KelurahanModel kelurahanModel1 = kelurahan.set(i, request);
                return Optional.of(kelurahanModel1);
            }
        }
        return Optional.empty();
    }


    @Override
    public Optional<KelurahanModel> delete(String id) {
        for (int i = 0; i < kelurahan.size(); i++) {
            if (kelurahan.get(i).getId().equals(id)) {
                KelurahanModel kelurahanModel = kelurahan.remove(i);
                return Optional.of(kelurahanModel);
            }
        }
        return Optional.empty();

    }
}
