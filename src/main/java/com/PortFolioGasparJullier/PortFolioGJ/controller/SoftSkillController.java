package com.PortFolioGasparJullier.PortFolioGJ.controller;

import com.PortFolioGasparJullier.PortFolioGJ.Entitys.SoftSkill;
import com.PortFolioGasparJullier.PortFolioGJ.Security.Service.Path;
import com.PortFolioGasparJullier.PortFolioGJ.Security.Service.iSoftSkillService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = Path.PATH)
public class SoftSkillController {

    @Autowired
    private iSoftSkillService iSoftSkillService;

    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/guardar/soft/skill")
    public void agregar_actualizar_Experienica(@RequestBody SoftSkill ss) {
        iSoftSkillService.saveSoftSkill(ss);
    }

    @GetMapping("/get/soft/skills")
    @ResponseBody
    public Iterable<SoftSkill> getSoftExperiencias() {
        return iSoftSkillService.getSoftSkills();
    }
    
    @GetMapping("/get/soft/skill/{id}")
    public Optional<SoftSkill> getHardExperiencia(@PathVariable Integer id) {
        return iSoftSkillService.getSoftSkillByID(id);
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/soft/skill/{id}")
    public void borrarExperiencia(@PathVariable Integer id) {
        iSoftSkillService.deleteSoftSkill(id);
    }

}
