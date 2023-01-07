package pe.idat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.client.OpenFeignClient;
import pe.idat.dto.AlumnoDTO;
import pe.idat.model.AlumnoAulaFK;
import pe.idat.model.Aula;
import pe.idat.model.AulaDetalle;
import pe.idat.repository.AulaRepository;
import pe.idat.repository.DetalleAulaRepository;

@Service
public class AulaServiceImpl implements AulaService {
	
	@Autowired
	private AulaRepository aulaRepo;
	
	@Autowired
	private DetalleAulaRepository detalleRepo;
	
	@Autowired
	private OpenFeignClient client;
	
	@Override
	public void guardarAula(Aula aula) {
		// TODO Auto-generated method stub
		
		aulaRepo.save(aula);
	}

	@Override
	public void asignarAlumnoAula() {
		// TODO Auto-generated method stub
		List<AlumnoDTO> listado = client.listarAlumnos();
		AlumnoAulaFK fk = null;
		AulaDetalle detalle = null;
		
		for (AlumnoDTO alumnoDTO : listado) {
			fk = new AlumnoAulaFK();
			fk.setIdAlumno(alumnoDTO.getCod());
			fk.setIdAula(1);
			
			detalle = new AulaDetalle();
			detalle.setFk(fk);
			detalleRepo.save(detalle);
		}
		
		
		
	}

}
