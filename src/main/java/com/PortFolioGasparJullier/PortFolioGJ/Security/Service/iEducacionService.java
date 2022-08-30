package com.PortFolioGasparJullier.PortFolioGJ.Security.Service;

import com.PortFolioGasparJullier.PortFolioGJ.Entitys.Educacion;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public interface iEducacionService {

    public List<Educacion> getEducaciones();
    
    public Optional<Educacion>  getHardSkillByID(Integer id);

    public void saveEducacion(Educacion per);

    public void deleteEducacion(Integer id);

    // public Educacion findEducacion(Integer id);
}
