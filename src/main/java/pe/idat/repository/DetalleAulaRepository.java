package pe.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.idat.model.AulaDetalle;

@Repository
public interface DetalleAulaRepository extends JpaRepository<AulaDetalle, Integer>{

}
