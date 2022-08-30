package com.PortFolioGasparJullier.PortFolioGJ.Security.Service;

import com.PortFolioGasparJullier.PortFolioGJ.Entitys.Educacion;
import com.PortFolioGasparJullier.PortFolioGJ.repository.iEducacionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EducacionService implements iEducacionService {

    @Autowired
    public iEducacionRepository iEducacionRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Educacion> getEducaciones() {
        return iEducacionRepository.findAll();
    }

    @Override
    @Transactional
    public void saveEducacion(Educacion edu) {
        iEducacionRepository.save(edu);
    }

    @Override
    @Transactional
    public void deleteEducacion(Integer id) {
        iEducacionRepository.deleteById(id);
    }

    @Override
    public Optional<Educacion> getHardSkillByID(Integer id) {
        return  iEducacionRepository.findById(id);
    }

}
