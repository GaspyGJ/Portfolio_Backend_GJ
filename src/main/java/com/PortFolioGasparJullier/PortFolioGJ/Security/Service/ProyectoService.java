
package com.PortFolioGasparJullier.PortFolioGJ.Security.Service;

import com.PortFolioGasparJullier.PortFolioGJ.Entitys.Proyecto;
import com.PortFolioGasparJullier.PortFolioGJ.repository.iProyectosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements iProyectoService {

    @Autowired
    public iProyectosRepository iProyectoRepository;
    
    @Override
    public List<Proyecto> getProyectos() {
           return iProyectoRepository.findAll();
    }

    @Override
    public Optional<Proyecto> getProyectoByID(Integer id){
        return iProyectoRepository.findById(id);
        }

    @Override
    public void saveProyecto(Proyecto p) {
        iProyectoRepository.save(p);
        }

    @Override
    public void deleteProyecto(Integer id) {
        iProyectoRepository.deleteById(id);
        }
    
}
