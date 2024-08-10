package org.project.sistemsekolah.kelurahan.controller;

import lombok.RequiredArgsConstructor;
import org.project.sistemsekolah.kelurahan.modal.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/kelurahan")
public class KelurahanController {
    private final List<KelurahanModel> kelurahan = new ArrayList<>();

    public KelurahanController() {
        KelurahanModel kelurahanModel = new KelurahanModel(1,"DESA SUKAHURIP","PAMARICAN");
        KelurahanModel kelurahanModel1 = new KelurahanModel(2,"DESA SEBANI","PANDAAN");
        KelurahanModel kelurahanModel2= new KelurahanModel(3,"DESA TEBON WARIS","PATUNG SAPI");

        List<KelurahanModel> kelurahanModels = Arrays.asList(kelurahanModel,kelurahanModel1,kelurahanModel2);

        DusunModel dusunModel = new DusunModel(1,"DUSUN CIPARAKAN");
        DusunModel dusunModel1 = new DusunModel(2,"DUSUN JEDUNG");
        DusunModel dusunModel2 = new DusunModel(3,"DUSUN WANGI");

        List<DusunModel> dusunModels = Arrays.asList(dusunModel,dusunModel1,dusunModel2);
        kelurahanModel.setDaftarDusun(dusunModels);
        kelurahanModel1.setDaftarDusun(dusunModels);
        kelurahanModel2.setDaftarDusun(dusunModels);

        RWModel rwModel = new RWModel(1,"RW04","PAK DORI");
        RWModel rwModel1 = new RWModel(2,"RW01","PAK MUHKLIS");
        RWModel rwModel2 = new RWModel(3,"RW05","PAK SAMSUL");

        List<RWModel> rwModels = Arrays.asList(rwModel, rwModel1, rwModel2);
        dusunModel.setDaftarRW(rwModels);
        dusunModel1.setDaftarRW(rwModels);
        dusunModel2.setDaftarRW(rwModels);

        RTModel rtModel = new RTModel(1,"RT09","PAK MANG MUKLAS");
        RTModel rtModel1 = new RTModel(2,"RT07","PAK MUMUH");
        RTModel rtModel2 = new RTModel(3,"RT08","PAK KHOLIS");

        List<RTModel> rtModels = Arrays.asList(rtModel, rtModel1, rtModel2);
        rwModel.setDaftarRT(rtModels);
        rwModel1.setDaftarRT(rtModels);
        rwModel2.setDaftarRT(rtModels);

        WargaModel wargaModel = new WargaModel(1,1234,"SABILLA MUHAMMAD RAYHAN","LAKI-LAKI",21);
        WargaModel wargaModel1 = new WargaModel(2,12345,"DANI IMDADUR ROHMAN","WARIA",21);
        WargaModel wargaModel2 = new WargaModel(3,123456,"ARIF ARISTAMA","LAKI-LAKI",20);

        List<WargaModel> warga = Arrays.asList(wargaModel, wargaModel1, wargaModel2);
        rtModel.setDaftarWarga(warga);
        rtModel1.setDaftarWarga(warga);
        rtModel2.setDaftarWarga(warga);


        kelurahan.addAll(kelurahanModels);

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
}
