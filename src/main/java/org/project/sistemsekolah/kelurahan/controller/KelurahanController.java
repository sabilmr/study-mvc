package org.project.sistemsekolah.kelurahan.controller;

import org.project.sistemsekolah.kelurahan.modal.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
@RequestMapping("/kelurahan")
public class KelurahanController {
    private final List<KelurahanModel> kelurahan = new ArrayList<>();

    public KelurahanController() {
        KelurahanModel kelurahanModel = new KelurahanModel(1,"DESA SUKAHURIP","PAMARICAN");
        KelurahanModel kelurahanModel1 = new KelurahanModel(2,"DESA SEBANI","PANDAAN");
        KelurahanModel kelurahanModel2= new KelurahanModel(3,"DESA TEBON WARIS","PATUNG SAPI");

        DusunModel dusunModel = new DusunModel(1,"DUSUN CIPARAKAN");
        DusunModel dusunModel1 = new DusunModel(2,"DUSUN JEDUNG");
        DusunModel dusunModel2 = new DusunModel(3,"DUSUN WANGI");

        List<DusunModel> dusun = Arrays.asList(dusunModel);
        kelurahanModel.setDaftarDusun(dusun);

        List<DusunModel> dusun1 = Arrays.asList(dusunModel1);
        kelurahanModel1.setDaftarDusun(dusun1);

        List<DusunModel> dusun2 = Arrays.asList(dusunModel2);
        kelurahanModel2.setDaftarDusun(dusun2);

        RWModel rwModel = new RWModel(1,"RW04","PAK DORI");
        RWModel rwModel1 = new RWModel(2,"RW01","PAK MUHKLIS");
        RWModel rwModel2 = new RWModel(3,"RW05","PAK SAMSUL");

        List<RWModel> rw = Arrays.asList(rwModel);
        dusunModel.setDaftarRW(rw);

        List<RWModel> rw1 = Arrays.asList(rwModel1);
        dusunModel1.setDaftarRW(rw1);

        List<RWModel> rw2 = Arrays.asList(rwModel2);
        dusunModel2.setDaftarRW(rw2);

        RTModel rtModel = new RTModel(1,"RT09","PAK MANG MUKLAS");
        RTModel rtModel1 = new RTModel(2,"RT07","PAK MUMUH");
        RTModel rtModel2 = new RTModel(3,"RT08","PAK KHOLIS");

        List<RTModel> rt = Arrays.asList(rtModel);
        rwModel.setDaftarRT(rt);

        List<RTModel> rt1 = Arrays.asList(rtModel1);
        rwModel1.setDaftarRT(rt1);

        List<RTModel> rt2 = Arrays.asList(rtModel2);
        rwModel2.setDaftarRT(rt2);

        WargaModel wargaModel = new WargaModel(1,1234,"SABILLA MUHAMMAD RAYHAN","LAKI-LAKI",21);
        WargaModel wargaModel1 = new WargaModel(2,12345,"DANI IMDADUR ROHMAN","WARIA",21);
        WargaModel wargaModel2 = new WargaModel(3,123456,"ARIF ARISTAMA","LAKI-LAKI",20);

        List<WargaModel> warga = Arrays.asList(wargaModel);
        rtModel.setDaftarWarga(warga);

        List<WargaModel> warga1 = Arrays.asList(wargaModel1);
        rtModel1.setDaftarWarga(warga1);

        List<WargaModel> warga2 = Arrays.asList(wargaModel2);
        rtModel2.setDaftarWarga(warga2);


        this.kelurahan.add(kelurahanModel);
        this.kelurahan.add(kelurahanModel1);
        this.kelurahan.add(kelurahanModel2);

    }


    @GetMapping
    public ModelAndView kelurahan() {
        ModelAndView view = new ModelAndView("pages/kelurahan/index");
        view.addObject("kelurahan", this.kelurahan);
        return view;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView view = new ModelAndView("pages/kelurahan/detail");

        Optional<KelurahanModel> result = this.kelurahan.stream().filter(k -> k.getId() == id).findFirst();
        if (result.isPresent()) {
            view.addObject("kelurahan", result.get());
        } else {
            return new ModelAndView("redirect:/kelurahan");
        }
        return view;
    }

    @GetMapping("/detail/dusun/{id}")
    public ModelAndView detailDusun(@PathVariable int id) {
        ModelAndView view = new ModelAndView("pages/kelurahan/detail-dusun");

        for (KelurahanModel kelurahanModel : this.kelurahan) {
            for (DusunModel dusunModel : kelurahanModel.getDaftarDusun()){
                if (dusunModel.getId().equals(id)){
                    view.addObject("kelurahan", kelurahanModel);
                    view.addObject("dusun", dusunModel);
                    return view;
                }
            }
        }
        return new ModelAndView("redirect:/kelurahan");
    }

    @GetMapping("/detail/dusun/rw/{id}")
    public ModelAndView detailDusunRw(@PathVariable int id) {
        ModelAndView view = new ModelAndView("pages/kelurahan/detail-rw");

        for (KelurahanModel kelurahanModel : this.kelurahan) {
            for (DusunModel dusunModel : kelurahanModel.getDaftarDusun()){
                for (RWModel rwModel : dusunModel.getDaftarRW()){
                    if (rwModel.getId().equals(id)){
                        view.addObject("kelurahan", kelurahanModel);
                        view.addObject("dusun", dusunModel);
                        view.addObject("rw", rwModel);
                        return view;
                    }
                }
            }
        }
        return new ModelAndView("redirect:/kelurahan");
    }

    @GetMapping("/detail/dusun/rw/rt/{id}")
    public ModelAndView detailDusunRwRt(@PathVariable int id) {
        ModelAndView view = new ModelAndView("pages/kelurahan/detail-rt");

        for (KelurahanModel kelurahanModel : this.kelurahan) {
            for (DusunModel dusunModel : kelurahanModel.getDaftarDusun()){
                for (RWModel rwModel : dusunModel.getDaftarRW()){
                    for (RTModel rtModel : rwModel.getDaftarRT()){
                        if (rtModel.getId().equals(id)){
                            view.addObject("kelurahan", kelurahanModel);
                            view.addObject("dusun", dusunModel);
                            view.addObject("rt", rtModel);
                            view.addObject("rw", rwModel);
                            return view;
                        }
                    }
                }
            }
        }
        return new ModelAndView("redirect:/kelurahan");
    }

    @GetMapping("/add")
    public ModelAndView add() {
        ModelAndView view = new ModelAndView("pages/kelurahan/add");
        KelurahanModel kelurahan = new KelurahanModel();

        List<DusunModel> dusun = new ArrayList<>();
        //warga list
        ArrayList<WargaModel> warga = new ArrayList<>();
        warga.add(new WargaModel(0,0,"","",0));
        // add rt
        ArrayList<RTModel> rtModels = new ArrayList<>();
        rtModels.add(new RTModel(0,"","",warga));
        // add rw
        ArrayList<RWModel> rwModels = new ArrayList<>();
        rwModels.add(new RWModel(0,"","",rtModels));
        //add dusun
        DusunModel dusunModel = new DusunModel(0,"", rwModels);
        dusun.add(dusunModel);

        kelurahan.setDaftarDusun(dusun);

        view.addObject("kelurahan", kelurahan);

        return view;

    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("kelurahan") KelurahanModel kelurahanModel) {
        kelurahan.add(kelurahanModel);
        return new ModelAndView("redirect:/kelurahan");
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable int id) {
        ModelAndView view = new ModelAndView("pages/kelurahan/edit");
        for (KelurahanModel kelurahanModel : this.kelurahan) {
            if (kelurahanModel.getId().equals(id)){
                view.addObject("kelurahan", kelurahanModel);
                return view;
            }
        }
        return new ModelAndView("redirect:/kelurahan");
    }

    @PostMapping("/update")
    public ModelAndView update(@ModelAttribute KelurahanModel kelurahanModel) {
        for (int i = 0; i < kelurahan.size(); i++) {
            if (kelurahan.get(i).getId() == kelurahanModel.getId()) {
                kelurahan.set(i, kelurahanModel);
                break;
            }
        }
        return new ModelAndView("redirect:/kelurahan");
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable int id) {
         ModelAndView view = new ModelAndView("pages/kelurahan/delete");
         for (KelurahanModel kelurahanModel : this.kelurahan) {
             if (kelurahanModel.getId().equals(id)) {
                 view.addObject("kelurahan", kelurahanModel);
                 return view;
             }
         }
         return new ModelAndView("redirect:/kelurahan");
    }

    @PostMapping("/remove")
    public ModelAndView remove(@ModelAttribute KelurahanModel kelurahanModel) {
        for (int i = 0; i < kelurahan.size(); i++) {
            if (kelurahan.get(i).getId() == kelurahanModel.getId()) {
                kelurahan.remove(i);
                break;
            }
        }
        return new ModelAndView("redirect:/kelurahan");
    }
}
