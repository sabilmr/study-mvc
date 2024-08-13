package org.project.sistemsekolah.v2.controller;

import org.project.sistemsekolah.v2.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/kelurahan/v2")
public class KelurahanV2Controller {
    public static List<KelurahanModelV2> kelurahan;

    public KelurahanV2Controller() {
        kelurahan = new ArrayList<>();

        KelurahanModelV2 sebani = new KelurahanModelV2(1,"DESA SEBANI","PANDAAN");
        KelurahanModelV2 sukahurip = new KelurahanModelV2(2,"DESA SUKAHURIP","PAMARICAN");

        List<DusunModelV2> dusunList = new ArrayList<>();
        sebani.setDaftarDusun(dusunList);

        List<DusunModelV2> dusun = new ArrayList<>();
        sukahurip.setDaftarDusun(dusun);

        DusunModelV2 jedung = new DusunModelV2(1,"DUSUN JEDUNG",sebani);
        DusunModelV2 ciparakan = new DusunModelV2(2,"DUSUN CIPARAKAN",sukahurip);
        dusunList.add(jedung);
        dusun.add(ciparakan);

        List<RWModelV2> rwList = new ArrayList<>();
        jedung.setDaftarRW(rwList);

        List<RWModelV2> rw04 = new ArrayList<>();
        ciparakan.setDaftarRW(rw04);

        RWModelV2 rw = new RWModelV2(1,"RW01", "BAPAK SUMANTO", jedung, sebani);
        RWModelV2 rw1 = new RWModelV2(2,"RW04", "BAPAK DORI", ciparakan, sukahurip);
        rwList.add(rw);
        rw04.add(rw1);

        List<RTModelV2> rtList = new ArrayList<>();
        rw.setDaftarRT(rtList);

        List<RTModelV2> rt09 = new ArrayList<>();
        rw1.setDaftarRT(rt09);

        RTModelV2 rt = new RTModelV2(1,"RT10","BAPAK SUEP", rw, jedung, sebani);
        RTModelV2 rt1 = new RTModelV2(2,"RT09","BAPAK MUKHLAS", rw, ciparakan, sukahurip);
        rtList.add(rt);
        rt09.add(rt1);

        List<WargaModelV2> wargaList = new ArrayList<>();
        rt.setDaftarWarga(wargaList);

        List<WargaModelV2> wargaModel = new ArrayList<>();
        rt1.setDaftarWarga(wargaModel);

        WargaModelV2 warga = new WargaModelV2(1,123,"SABILLA MUHAMMAD RAYHAN","LAKI-LAKI",21);
        WargaModelV2 warga1 = new WargaModelV2(2,1234,"DANI IMDADUR","LAKI-LAKI",21);
        wargaList.add(warga);
        wargaModel.add(warga1);


        kelurahan.add(sebani);
        kelurahan.add(sukahurip);

    }

    @GetMapping
    public ModelAndView list(){
        ModelAndView mav = new ModelAndView("pages/desa/list");
        mav.addObject("kelurahan", kelurahan);
        return mav;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView view(@PathVariable("id") Integer id){
        ModelAndView mav = new ModelAndView("pages/desa/detail/detail");

        Optional<KelurahanModelV2> result = kelurahan.stream().filter(x -> x.getId().equals(id)).findFirst();
        if (result.isPresent()) {
            mav.addObject("kelurahan", result.get());
            return mav;
        } else {
            return new ModelAndView("redirect:/kelurahan/v2");
        }
    }

    @GetMapping("/detail/{kelurahanId}/dusun/{dusunId}")
    public ModelAndView dusun(@PathVariable("kelurahanId") Integer kelurahanId,
                              @PathVariable("dusunId") Integer dusunId){
        ModelAndView mav = new ModelAndView("pages/desa/detail/detail-dusun");

        Optional<KelurahanModelV2> result = kelurahan.stream().filter(x -> x.getId().equals(kelurahanId)).findFirst();
        if (result.isPresent()) {
            DusunModelV2 dusun = result.get().getDaftarDusun().stream().filter(x -> x.getId().equals(dusunId)).findFirst().get();
            mav.addObject("kelurahan", result.get());
            mav.addObject("dusun", dusun);
            return mav;
        } else {
            return new ModelAndView("redirect:/kelurahan/v2");
        }
    }

    @GetMapping("/detail/{kelurahanId}/dusun/{dusunId}/rw/{rwId}")
    public ModelAndView rw(@PathVariable("kelurahanId") Integer kelurahanId,
                           @PathVariable("dusunId") Integer dusunId,
                           @PathVariable("rwId") Integer rwId){
        ModelAndView mav = new ModelAndView("pages/desa/detail/detail-rw");

        Optional<KelurahanModelV2> result = kelurahan.stream().filter(x -> x.getId().equals(kelurahanId)).findFirst();
        if (result.isPresent()) {
            DusunModelV2 dusun = result.get().getDaftarDusun().stream().filter(x -> x.getId().equals(dusunId)).findFirst().get();
            RWModelV2 rw = dusun.getDaftarRW().stream().filter(x -> x.getId().equals(rwId)).findFirst().get();
            mav.addObject("kelurahan", result.get());
            mav.addObject("dusun", dusun);
            mav.addObject("rw", rw);
            return mav;
        } else {
            return new ModelAndView("redirect:/kelurahan/v2");
        }
    }

    @GetMapping("/detail/{kelurahanId}/dusun/{dusunId}/rw/{rwId}/rt/{rtId}")
    public ModelAndView rt(@PathVariable("kelurahanId") Integer kelurahanId,
                           @PathVariable("dusunId") Integer dusunId,
                           @PathVariable("rwId") Integer rwId,
                           @PathVariable("rtId") Integer rtId) {
        ModelAndView mav = new ModelAndView("pages/desa/detail/detail-rt");
        mav.addObject("id", kelurahanId);

        Optional<KelurahanModelV2> desa = kelurahan.stream().filter(x -> x.getId().equals(dusunId)).findFirst();
        if (desa.isPresent()) {
            DusunModelV2 dusun = desa.get().getDaftarDusun().stream().filter(x -> x.getId().equals(dusunId)).findFirst().get();
            RWModelV2 rw = dusun.getDaftarRW().stream().filter(x -> x.getId().equals(rwId)).findFirst().get();
            RTModelV2 rt = rw.getDaftarRT().stream().filter(x -> x.getId().equals(rtId)).findFirst().get();
            mav.addObject("kelurahan", desa.get());
            mav.addObject("dusun", dusun);
            mav.addObject("rw", rw);
            mav.addObject("rt", rt);
            return mav;
        } else {
            return new ModelAndView("redirect:/kelurahan/v2");
        }
    }
}
