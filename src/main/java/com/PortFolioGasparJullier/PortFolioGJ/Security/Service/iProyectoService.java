package com.PortFolioGasparJullier.PortFolioGJ.Security.Service;

import com.PortFolioGasparJullier.PortFolioGJ.Entitys.Proyecto;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public interface iProyectoService {

    public List<Proyecto> getProyectos();

    public Optional<Proyecto> getProyectoByID(Integer id);

    public void saveProyecto(Proyecto p);

    public void deleteProyecto(Integer id);

    // public Educacion findEducacion(Integer id);
}
