package org.foobarspam.cotxox.testing;

import org.foobarspam.cotxox.carrera.*;
import org.foobarspam.cotxox.tarifa.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TarifaTest {
	
	static double costeMilla,costeMinuto;
	
	@Before
	public void setUp() {
		costeMilla = 1.35;
		costeMinuto = 0.35;
	}
	
	@Test
	public void costePorMinutoTest() {
		
		Tarifa tarifa = new Tarifa();
		
		double resultado = tarifa.getCosteTiempo(10);
		double resultadoEsperado = 3.5;
		
		assertEquals(resultadoEsperado,resultado,0);
	}
	
	@Test
	public void costePorDistaciaTest() {
		
		Tarifa tarifa = new Tarifa();
		
		double resultado = tarifa.getCosteDistancia(10);
		double resultadoEsperado = 13.5;
		
		assertEquals(resultadoEsperado,resultado,0);
	}
	
	@Test
	public void costeEsperadoTest() {
		
		Tarifa tarifa = new Tarifa();
		Carrera carrera = new Carrera("4916119711304546");
		
		double resultado = tarifa.getTotalEsperado(carrera);
		double resultadoEsperado = 13.9625;
		
		assertEquals(resultadoEsperado, resultado,0);
		
	}
	
	
}
