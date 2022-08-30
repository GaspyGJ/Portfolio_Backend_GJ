package com.PortFolioGasparJullier.PortFolioGJ.Security.Repository;

import com.PortFolioGasparJullier.PortFolioGJ.Security.Entity.Rol;
import com.PortFolioGasparJullier.PortFolioGJ.Security.Enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
  Optional<Rol> findByRolNombre(RolNombre rolNombre);
}