package pe.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.idat.model.Aula;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Integer>{
	
	
}
