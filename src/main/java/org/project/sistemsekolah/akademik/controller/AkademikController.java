package org.project.sistemsekolah.akademik.controller;

import org.project.sistemsekolah.akademik.model.FakultasModel;
import org.project.sistemsekolah.akademik.model.JurusanModel;
import org.project.sistemsekolah.akademik.service.FakultasService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/akademik")
public class AkademikController {
//    public static List<FakultasModel> fakultas;
//
//    public AkademikController() {
//        fakultas = new ArrayList<>();
//
//        FakultasModel fDokter = new FakultasModel(1,"FK","FAKULTAS KDOKTERAN");
//        FakultasModel fTeknik = new FakultasModel(2,"FT","FAKULTAS TEKNIK");
//        FakultasModel fEkonomi = new FakultasModel(3,"FE","FAKULTAS EKONOMI");
//
//        List<JurusanModel> j1 = new ArrayList<>();
//        fDokter.setJurusan(j1);
//
//        List<JurusanModel> j2 = new ArrayList<>();
//        fTeknik.setJurusan(j2);
//
//        List<JurusanModel> j3 = new ArrayList<>();
//        fEkonomi.setJurusan(j3);
//        //list jurusan 1
//        JurusanModel jurusan1 = new JurusanModel(1,"KG","KEDOKTERAN GIGI");
//        j1.add(jurusan1);
//        JurusanModel jurusan2 = new JurusanModel(2,"FS", "FISIO TERAPI");
//        j2.add(jurusan2);
//        JurusanModel jurusan3 = new JurusanModel(3,"KU","KEDOKTERAN UMUM");
//        j3.add(jurusan3);
//
//        fakultas.add(fDokter);
//        fakultas.add(fTeknik);
//        fakultas.add(fEkonomi);
//}
    private final FakultasService fakultasService;

    public AkademikController(FakultasService fakultasService) {
        this.fakultasService = fakultasService;
    }


    @GetMapping
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("pages/akademik/index");

        List<FakultasModel> fakultas = fakultasService.get();
        view.addObject("fakultas", fakultas);
        return view;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable String id){
        ModelAndView view = new ModelAndView("pages/akademik/detail/detail");

        Optional<FakultasModel> model = fakultasService.getById(id);
        if(model.isPresent()){
            view.addObject("fakultas", model.get());
            return view;
        } else {
            return new ModelAndView("redirect:/akademik");
        }
    }

    @GetMapping("/detail/{fakultasId}/jurusan/{jurusanId}")
    public ModelAndView jurusan(@PathVariable String fakultasId,
                                @PathVariable String jurusanId){
        ModelAndView view = new ModelAndView("pages/akademik/detail/detail-jurusan");

        Optional<FakultasModel> fakultasModel = fakultasService.getById(fakultasId);
        if(fakultasModel.isPresent()){
            JurusanModel jurusanModel = fakultasModel.get().getJurusan().stream().filter(j -> j.getId().equals(jurusanId)).findFirst().get();
            view.addObject("fakultas", fakultasModel.get());
            view.addObject("jurusan", jurusanModel);
            return view;
        } else {
            return new ModelAndView("redirect:/akademik");
        }
    }
}

