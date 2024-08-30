package org.project.sistemsekolah.akademik.service;

import org.project.sistemsekolah.akademik.model.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FakultasServiceImpl implements FakultasService {
    private static List<FakultasModel> fakultas;

    public FakultasServiceImpl() {
        fakultas = new ArrayList<>();

        FakultasModel fDokter = new FakultasModel(UUID.randomUUID().toString(), "FK", "FAKULTAS KDOKTERAN");
        FakultasModel fTeknik = new FakultasModel(UUID.randomUUID().toString(), "FT", "FAKULTAS TEKNIK");
        FakultasModel fEkonomi = new FakultasModel(UUID.randomUUID().toString(), "FE", "FAKULTAS EKONOMI");

        List<JurusanModel> j1 = new ArrayList<>();
        fDokter.setJurusan(j1);

        List<JurusanModel> j2 = new ArrayList<>();
        fTeknik.setJurusan(j2);

        List<JurusanModel> j3 = new ArrayList<>();
        fEkonomi.setJurusan(j3);
        //list jurusan 1
        JurusanModel jurusan1 = new JurusanModel(UUID.randomUUID().toString(), "KG", "KEDOKTERAN GIGI");
        j1.add(jurusan1);
        JurusanModel jurusan2 = new JurusanModel(UUID.randomUUID().toString(), "FS", "FISIO TERAPI");
        j2.add(jurusan2);
        JurusanModel jurusan3 = new JurusanModel(UUID.randomUUID().toString(), "KU", "KEDOKTERAN UMUM");
        j3.add(jurusan3);

        List<JumlahMahasiswaModel> jum1 = new ArrayList<>();
        jurusan1.setJumlahMahasiswa(jum1);

        List<JumlahMahasiswaModel> jum2 = new ArrayList<>();
        jurusan2.setJumlahMahasiswa(jum2);

        List<JumlahMahasiswaModel> jum3 = new ArrayList<>();
        jurusan3.setJumlahMahasiswa(jum3);

        JumlahMahasiswaModel jumlahMahasiswa1 = new JumlahMahasiswaModel(UUID.randomUUID().toString(), 2024);
        jum1.add(jumlahMahasiswa1);
        JumlahMahasiswaModel jumlahMahasiswa2 = new JumlahMahasiswaModel(UUID.randomUUID().toString(), 2023);
        jum2.add(jumlahMahasiswa2);
        JumlahMahasiswaModel jumlahMahasiswa3 = new JumlahMahasiswaModel(UUID.randomUUID().toString(), 2022);
        jum3.add(jumlahMahasiswa3);

        List<MahasiswaModel> mahasiswa1 = new ArrayList<>();
        jumlahMahasiswa1.setMahasiswa(mahasiswa1);

        List<MahasiswaModel> mahasiswa2 = new ArrayList<>();
        jumlahMahasiswa2.setMahasiswa(mahasiswa2);

        List<MahasiswaModel> mahasiswa3 = new ArrayList<>();
        jumlahMahasiswa3.setMahasiswa(mahasiswa3);

        MahasiswaModel siswa1 = new MahasiswaModel(UUID.randomUUID().toString(), 1001201,"SABILLA MUHAMMAD RAYHAN");
        mahasiswa1.add(siswa1);
        MahasiswaModel siswa2 = new MahasiswaModel(UUID.randomUUID().toString(),1001202,"DANI IMDADUR");
        mahasiswa2.add(siswa2);
        MahasiswaModel siswa3 = new MahasiswaModel(UUID.randomUUID().toString(),1001203,"ARIF ARISTAMA");
        mahasiswa3.add(siswa3);

        List<MataKuliahModel> mataKuliah1 = new ArrayList<>();
        siswa1.setMataKuliah(mataKuliah1);

        List<MataKuliahModel> mataKuliah2 = new ArrayList<>();
        siswa2.setMataKuliah(mataKuliah2);

        List<MataKuliahModel> mataKuliah3 = new ArrayList<>();
        siswa3.setMataKuliah(mataKuliah3);

        MataKuliahModel mataKuliahModel1 = new MataKuliahModel(UUID.randomUUID().toString(),"MK001","MATAKULIAH 1", "DOSEN-01","A");
        mataKuliah1.add(mataKuliahModel1);
        MataKuliahModel mataKuliahModel2 = new MataKuliahModel(UUID.randomUUID().toString(),"MK002","MATAKULIAH 2", "DOSEN-02","A");
        mataKuliah2.add(mataKuliahModel2);
        MataKuliahModel mataKuliahModel3 = new MataKuliahModel(UUID.randomUUID().toString(),"MK003","MATAKULIAH 3", "DOSEN-03","A");
        mataKuliah3.add(mataKuliahModel3);

        fakultas.add(fDokter);
        fakultas.add(fTeknik);
        fakultas.add(fEkonomi);
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
