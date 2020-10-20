package ar.edu.unlam.pb2.materia;

public class Materia {
	
	private String nombre;
	private Parcial primerParcial;
	private Parcial segundoPacial;
	private Boolean primerParcialEvaluado = false;
	private Boolean segundoParcialEvaluado = false;
	
	
	public Materia(String nombre) {
		this.nombre = nombre;
		this.primerParcial = new Parcial();
		this.segundoPacial = new Parcial();
	}
	
	public void evaluar(Integer numeroDeParcial, Integer nota) {
		if(numeroDeParcial.equals(1)) {
			this.primerParcial.setParcial(numeroDeParcial);
			this.primerParcial.setNota(nota);
			primerParcialEvaluado = true;
		}
		else {
			if(numeroDeParcial.equals(2)) {
				this.segundoPacial.setParcial(numeroDeParcial);
				this.segundoPacial.setNota(nota);
				segundoParcialEvaluado = true;
			}
		}
	}
	
	public void recuperar(Integer numeroParcial, Integer nota) {
		if(numeroParcial.equals(1) && primerParcialEvaluado == true) {
			this.primerParcial.setNota(nota);
		}
		else {
			if(numeroParcial.equals(2) && segundoParcialEvaluado == true) {
				this.segundoPacial.setNota(nota);
			}
		}
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Parcial getPrimerParcial() {
		return primerParcial;
	}

	
	public Parcial getSegundoPacial() {
		return segundoPacial;
	}

	
}
