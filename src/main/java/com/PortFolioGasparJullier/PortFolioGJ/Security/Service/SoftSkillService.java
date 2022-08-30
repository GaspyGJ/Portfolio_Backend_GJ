
package com.PortFolioGasparJullier.PortFolioGJ.Security.Service;

import com.PortFolioGasparJullier.PortFolioGJ.Entitys.SoftSkill;
import com.PortFolioGasparJullier.PortFolioGJ.repository.iSoftSkillRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoftSkillService implements iSoftSkillService {
        @Autowired
    public iSoftSkillRepository iSoftSkillRepository;
    
    @Override
    public List<SoftSkill> getSoftSkills() {
       return  iSoftSkillRepository.findAll();
    }

    @Override
    public void saveSoftSkill(SoftSkill hs) {
        iSoftSkillRepository.save(hs);
    }

    @Override
    public void deleteSoftSkill(Integer id) {
        iSoftSkillRepository.deleteById(id);
    }

    @Override
    public Optional<SoftSkill> getSoftSkillByID(Integer id) {
            return  iSoftSkillRepository.findById(id);
    }
    
}
