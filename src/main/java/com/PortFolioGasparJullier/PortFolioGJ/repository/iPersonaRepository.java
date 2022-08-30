package com.PortFolioGasparJullier.PortFolioGJ.repository;

import com.PortFolioGasparJullier.PortFolioGJ.Entitys.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


public interface iPersonaRepository extends JpaRepository<Persona,Integer>{
    //JpaRepository tiene todas los metodos necesarios para hacer CRUD en la bbdd
}