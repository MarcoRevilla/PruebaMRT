package pe.idat.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="detalle_aula")
public class AulaDetalle {
	
	@Id
	private AlumnoAulaFK fk = new AlumnoAulaFK();

	public AlumnoAulaFK getFk() {
		return fk;
	}

	public void setFk(AlumnoAulaFK fk) {
		this.fk = fk;
	}
	
	

}
