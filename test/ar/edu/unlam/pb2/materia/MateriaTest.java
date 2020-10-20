package ar.edu.unlam.pb2.materia;

import static org.junit.Assert.*;

import org.junit.Test;

public class MateriaTest {

	@Test
	public void queSePuedaCalificarUnParcial() {
		Materia pb2 = new Materia("PB2");
		pb2.evaluar(1, 6);
		Integer valorEsperado = 6;
		
		Integer valorObtenido = pb2.getPrimerParcial().getNota();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queSePuedaRecuperarUnParcialEvaluado() {
		Materia pb2 = new Materia("PB2");
		pb2.evaluar(1, 8);
		
		pb2.recuperar(1, 9);
		Integer valorEsperado = 9;
		Integer valorObtenido = pb2.getPrimerParcial().getNota();
		
		assertEquals(valorEsperado, valorObtenido); 
	}
	
	@Test
	public void queNoSePuedaRecuperarUnParcialQueNoFueEvaluado() {
		Materia pb2 = new Materia("PB2");
		
		pb2.recuperar(1, 6);
		
		assertNull(pb2.getPrimerParcial().getNota());
	}

}
