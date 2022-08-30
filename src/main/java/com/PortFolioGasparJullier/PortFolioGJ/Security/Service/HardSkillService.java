
package com.PortFolioGasparJullier.PortFolioGJ.Security.Service;

import com.PortFolioGasparJullier.PortFolioGJ.Entitys.HardSkill;
import com.PortFolioGasparJullier.PortFolioGJ.repository.iHardSkillRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HardSkillService implements iHardSkillService {

    @Autowired
    public iHardSkillRepository iHardSkillRepository;
    
    @Override
    public List<HardSkill> getHardSkills() {
       return  iHardSkillRepository.findAll();
    }

    @Override
    public void saveHardSkill(HardSkill hs) {
        iHardSkillRepository.save(hs);
    }

    @Override
    public void deleteHardSkill(Integer id) {
        iHardSkillRepository.deleteById(id);
    }

    @Override
    public Optional<HardSkill> getHardSkillByID(Integer id) {
      return  iHardSkillRepository.findById(id);
      
    }
    
}
