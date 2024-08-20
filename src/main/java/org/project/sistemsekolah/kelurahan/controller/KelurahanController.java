package org.project.sistemsekolah.kelurahan.controller;

import org.project.sistemsekolah.kelurahan.modal.*;
import org.project.sistemsekolah.kelurahan.service.KelurahanService;
import org.project.sistemsekolah.kelurahan.v2.model.DusunModelV2;
import org.project.sistemsekolah.kelurahan.v2.model.KelurahanModelV2;
import org.project.sistemsekolah.kelurahan.v2.model.RTModelV2;
import org.project.sistemsekolah.kelurahan.v2.model.RWModelV2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
@RequestMapping("/kelurahan")
public class KelurahanController {
//    private final List<KelurahanModel> kelurahan = new ArrayList<>();
//
//    public KelurahanController() {
//        KelurahanModel kelurahanModel = new KelurahanModel(1,"DESA SUKAHURIP","PAMARICAN");
//        KelurahanModel kelurahanModel1 = new KelurahanModel(2,"DESA SEBANI","PANDAAN");
//        KelurahanModel kelurahanModel2= new KelurahanModel(3,"DESA TEBON WARIS","PATUNG SAPI");
//
//        DusunModel dusunModel = new DusunModel(1,"DUSUN CIPARAKAN");
//        DusunModel dusunModel1 = new DusunModel(2,"DUSUN JEDUNG");
//        DusunModel dusunModel2 = new DusunModel(3,"DUSUN WANGI");
//
//        List<DusunModel> dusun = Arrays.asList(dusunModel);
//        kelurahanModel.setDaftarDusun(dusun);
//
//        List<DusunModel> dusun1 = Arrays.asList(dusunModel1);
//        kelurahanModel1.setDaftarDusun(dusun1);
//
//        List<DusunModel> dusun2 = Arrays.asList(dusunModel2);
//        kelurahanModel2.setDaftarDusun(dusun2);
//
//        RWModel rwModel = new RWModel(1,"RW04","PAK DORI");
//        RWModel rwModel1 = new RWModel(2,"RW01","PAK MUHKLIS");
//        RWModel rwModel2 = new RWModel(3,"RW05","PAK SAMSUL");
//
//        List<RWModel> rw = Arrays.asList(rwModel);
//        dusunModel.setDaftarRW(rw);
//
//        List<RWModel> rw1 = Arrays.asList(rwModel1);
//        dusunModel1.setDaftarRW(rw1);
//
//        List<RWModel> rw2 = Arrays.asList(rwModel2);
//        dusunModel2.setDaftarRW(rw2);
//
//        RTModel rtModel = new RTModel(1,"RT09","PAK MANG MUKLAS");
//        RTModel rtModel1 = new RTModel(2,"RT07","PAK MUMUH");
//        RTModel rtModel2 = new RTModel(3,"RT08","PAK KHOLIS");
//
//        List<RTModel> rt = Arrays.asList(rtModel);
//        rwModel.setDaftarRT(rt);
//
//        List<RTModel> rt1 = Arrays.asList(rtModel1);
//        rwModel1.setDaftarRT(rt1);
//
//        List<RTModel> rt2 = Arrays.asList(rtModel2);
//        rwModel2.setDaftarRT(rt2);
//
//        WargaModel wargaModel = new WargaModel(1,1234,"SABILLA MUHAMMAD RAYHAN","LAKI-LAKI",21);
//        WargaModel wargaModel1 = new WargaModel(2,12345,"DANI IMDADUR ROHMAN","WARIA",21);
//        WargaModel wargaModel2 = new WargaModel(3,123456,"ARIF ARISTAMA","LAKI-LAKI",20);
//
//        List<WargaModel> warga = Arrays.asList(wargaModel);
//        rtModel.setDaftarWarga(warga);
//
//        List<WargaModel> warga1 = Arrays.asList(wargaModel1);
//        rtModel1.setDaftarWarga(warga1);
//
//        List<WargaModel> warga2 = Arrays.asList(wargaModel2);
//        rtModel2.setDaftarWarga(warga2);
//
//
//        this.kelurahan.add(kelurahanModel);
//        this.kelurahan.add(kelurahanModel1);
//        this.kelurahan.add(kelurahanModel2);
//
//    }

    private final KelurahanService kelurahanService;


    public KelurahanController(KelurahanService kelurahanService) {
        this.kelurahanService = kelurahanService;
    }


    @GetMapping
    public ModelAndView kelurahan() {
        ModelAndView view = new ModelAndView("pages/kelurahan/index");

        List<KelurahanModel> result = kelurahanService.get();
        view.addObject("kelurahan", result);
        return view;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable String id) {
        ModelAndView view = new ModelAndView("pages/kelurahan/detail/detail");

        Optional<KelurahanModel> result = kelurahanService.getById(id);
        if (result.isPresent()) {
            view.addObject("kelurahan", result.get());
        } else {
            return new ModelAndView("redirect:/kelurahan");
        }
        return view;
    }

    @GetMapping("/detail/{kelurahanId}/dusun/{dusunId}")
    public ModelAndView detailDusun(@PathVariable String kelurahanId,
                                    @PathVariable String dusunId) {
        ModelAndView view = new ModelAndView("pages/kelurahan/detail/detail-dusun");

        Optional<KelurahanModel> result = kelurahanService.getById(kelurahanId);
        if (result.isPresent()) {
            DusunModel dusun = result.get().getDaftarDusun().stream().filter(d -> d.getId() == dusunId).findFirst().get();
            view.addObject("kelurahan", result.get());
            view.addObject("dusun", dusun);
        } else {
            return new ModelAndView("redirect:/kelurahan");
        }
        return view;
    }

    @GetMapping("/detail/{kelurahanId}/dusun/{dusunId}/rw/{rwId}")
    public ModelAndView rw(@PathVariable("kelurahanId") String kelurahanId,
                           @PathVariable("dusunId") String dusunId,
                           @PathVariable("rwId") String rwId){
        ModelAndView mav = new ModelAndView("pages/kelurahan/detail/detail-rw");

        Optional<KelurahanModel> result = kelurahanService.getById(kelurahanId);
        if (result.isPresent()) {
            DusunModel dusun = result.get().getDaftarDusun().stream().filter(x -> x.getId().equals(dusunId)).findFirst().get();
            RWModel rw = dusun.getDaftarRW().stream().filter(x -> x.getId().equals(rwId)).findFirst().get();
            mav.addObject("kelurahan", result.get());
            mav.addObject("dusun", dusun);
            mav.addObject("rw", rw);
            return mav;
        } else {
            return new ModelAndView("redirect:/kelurahan");
        }
    }

    @GetMapping("/detail/{kelurahanId}/dusun/{dusunId}/rw/{rwId}/rt/{rtId}")
    public ModelAndView rt(@PathVariable("kelurahanId") String kelurahanId,
                           @PathVariable("dusunId") String dusunId,
                           @PathVariable("rwId") String rwId,
                           @PathVariable("rtId") String rtId) {
        ModelAndView mav = new ModelAndView("pages/kelurahan/detail/detail-rt");

        Optional<KelurahanModel> desa = kelurahanService.getById(kelurahanId);
        if (desa.isPresent()) {
            DusunModel dusun = desa.get().getDaftarDusun().stream().filter(x -> x.getId().equals(dusunId)).findFirst().get();
            RWModel rw = dusun.getDaftarRW().stream().filter(x -> x.getId().equals(rwId)).findFirst().get();
            RTModel rt = rw.getDaftarRT().stream().filter(x -> x.getId().equals(rtId)).findFirst().get();
            mav.addObject("kelurahan", desa.get());
            mav.addObject("dusun", dusun);
            mav.addObject("rw", rw);
            mav.addObject("rt", rt);
            return mav;
        } else {
            return new ModelAndView("redirect:/kelurahan");
        }
    }

    @GetMapping("/add")
    public ModelAndView add() {
        ModelAndView view = new ModelAndView("pages/kelurahan/add");
        KelurahanModel kelurahanModel = new KelurahanModel();

        List<DusunModel> dusunModels = new ArrayList<>();

        ArrayList<WargaModel> wargaModels = new ArrayList<>();
        wargaModels.add(new WargaModel(0,0,"","",0));

        ArrayList<RTModel> rtModels = new ArrayList<>();
        rtModels.add(new RTModel(0,"","", wargaModels));

        ArrayList<RWModel> rwModels = new ArrayList<>();
        rwModels.add(new RWModel(0,"","", rtModels));

        DusunModel dusun = new DusunModel("","", rwModels);
        dusunModels.add(dusun);

        kelurahanModel.setDaftarDusun(dusunModels);

        view.addObject("kelurahan", kelurahanModel);
        return view;

    }

    @GetMapping("/add/v2")
    public ModelAndView addV2() {
        ModelAndView view = new ModelAndView("pages/kelurahan/addV2");
        KelurahanModel kelurahanModel = new KelurahanModel();

        List<DusunModel> dusunModels = new ArrayList<>();

        ArrayList<WargaModel> wargaModels = new ArrayList<>();
        wargaModels.add(new WargaModel(0,0,"","",0));

        ArrayList<RTModel> rtModels = new ArrayList<>();
        rtModels.add(new RTModel(0,"","", wargaModels));

        ArrayList<RWModel> rwModels = new ArrayList<>();
        rwModels.add(new RWModel(0,"","", rtModels));

        DusunModel dusun = new DusunModel("","", rwModels);
        dusunModels.add(dusun);

        kelurahanModel.setDaftarDusun(dusunModels);

        view.addObject("kelurahan", kelurahanModel);
        return view;

    }


    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("kelurahan") KelurahanModel kelurahanModel) {
            kelurahanService.save(kelurahanModel);
        return new ModelAndView("redirect:/kelurahan");
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable String id) {
        ModelAndView view = new ModelAndView("pages/kelurahan/edit");

        Optional<KelurahanModel> result = kelurahanService.getById(id);
        if (result.isPresent()) {
            view.addObject("kelurahan", result.get());
            return view;
        }

        return new ModelAndView("redirect:/kelurahan");
    }

    @PostMapping("/update")
    public ModelAndView update(@ModelAttribute KelurahanModel kelurahanModel) {
        kelurahanService.update(kelurahanModel.getId(), kelurahanModel);
        return new ModelAndView("redirect:/kelurahan");
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable Integer id) {
        ModelAndView mav = new ModelAndView("pages/kelurahan/delete");

//        Optional<KelurahanModel> result = kelurahanService.getById(id);
//        if (result.isPresent()) {
//            mav.addObject("kelurahan", result.get());
//            return mav;
//        }

         return new ModelAndView("redirect:/kelurahan");
    }

    @PostMapping("/remove")
    public ModelAndView remove(@ModelAttribute KelurahanModel kelurahanModel) {
        return new ModelAndView("redirect:/kelurahan");
    }
}
