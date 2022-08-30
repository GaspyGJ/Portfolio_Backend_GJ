package com.PortFolioGasparJullier.PortFolioGJ.Security.Service;

import com.PortFolioGasparJullier.PortFolioGJ.Entitys.Persona;
import com.PortFolioGasparJullier.PortFolioGJ.repository.iPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaService implements iPersonaService {

    @Autowired
    public iPersonaRepository iPersonaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> getPersonas() {
        return iPersonaRepository.findAll();
    }

    @Override
    @Transactional
    public void savePersona(Persona per) {
        iPersonaRepository.save(per);
    }

    @Override
    @Transactional
    public void deletePersona(Integer id) {
        iPersonaRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona findPersona(Integer id) {
        return iPersonaRepository.findById(id).orElse(null);
    }

}
