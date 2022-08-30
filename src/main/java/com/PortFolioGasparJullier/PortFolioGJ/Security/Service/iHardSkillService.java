package com.PortFolioGasparJullier.PortFolioGJ.Security.Service;

import com.PortFolioGasparJullier.PortFolioGJ.Entitys.HardSkill;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public interface iHardSkillService {

    public List<HardSkill> getHardSkills();
    
    public Optional<HardSkill>  getHardSkillByID(Integer id);

    public void saveHardSkill(HardSkill exp);

    public void deleteHardSkill(Integer id);

    // public Educacion findEducacion(Integer id);
}
