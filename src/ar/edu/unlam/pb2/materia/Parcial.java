package ar.edu.unlam.pb2.materia;

public class Parcial {

	private Integer numeroDeParcial;
	private Integer nota;
	
	
	public Parcial() {
		this.numeroDeParcial = 0;
		this.nota = null;
	}


	public Integer getParcial() {
		return numeroDeParcial;
	}


	public void setParcial(Integer parcial) {
		this.numeroDeParcial = parcial;
	}


	public Integer getNota() {
		return nota;
	}


	public void setNota(Integer nota) {
		this.nota = nota;
	}
	
	
	
}
