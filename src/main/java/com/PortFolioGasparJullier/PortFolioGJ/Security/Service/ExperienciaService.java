package com.PortFolioGasparJullier.PortFolioGJ.Security.Service;

import com.PortFolioGasparJullier.PortFolioGJ.Entitys.Experiencia;
import com.PortFolioGasparJullier.PortFolioGJ.repository.iExperienciaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ExperienciaService implements iExperienciaService {

    @Autowired
    public iExperienciaRepository iExperienciaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Experiencia> getExperiencias() {
        return iExperienciaRepository.findAll();
    }

    @Override
    @Transactional
    public void saveExperiencia(Experiencia exp) {
        iExperienciaRepository.save(exp);
    }

    @Override
    @Transactional
    public void deleteExperiencia(Integer id) {
        iExperienciaRepository.deleteById(id);
    }

    @Override
    public Optional<Experiencia> getHardSkillByID(Integer id) {
        return  iExperienciaRepository.findById(id);
    }

}
