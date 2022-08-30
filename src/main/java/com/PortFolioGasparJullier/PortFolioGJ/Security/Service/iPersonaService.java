package com.PortFolioGasparJullier.PortFolioGJ.Security.Service;

import com.PortFolioGasparJullier.PortFolioGJ.Entitys.Persona;

import java.util.List;

public interface iPersonaService {

    public List<Persona> getPersonas();

    public void savePersona(Persona per);

    public void deletePersona(Integer id);

    public Persona findPersona(Integer id);

}
