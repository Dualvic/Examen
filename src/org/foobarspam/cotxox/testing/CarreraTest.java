package org.foobarspam.cotxox.testing;

import static org.junit.Assert.*;

import org.foobarspam.cotxox.carrera.*;
import org.junit.Test;

public class CarreraTest {

	@Test
	public void constructorTest() {
		
		Carrera carrera = new Carrera("4916119711304546");
		String tarjeta = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		double distancia = 7.75d;
		String destino = "Magaluf";
		int tiempoEsperado = 10;
		
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperado);
		
		assertEquals(tarjeta, carrera.getTarjetaCredito());
		assertEquals(origen, carrera.getOrigen());
		assertEquals(destino, carrera.getDestino());
		assertEquals(tiempoEsperado, carrera.getTiempoEsperado());
		
	}
	
	@Test
	public void PropinaTest() {
		
		double propinaEsperada = 1d;
		
		Carrera carrera = new Carrera("4916119711304546");
		
		carrera.recibirPropina(1);
		
		assertEquals(propinaEsperada, carrera.getPropina(), 0);
		
	}
	
	@Test
	public void getCosteTotalTest() {
		
		double esperado = 6;
		
		Carrera carrera = new Carrera("4916119711304546");
		
		assertEquals(esperado,carrera.getCosteEsperado(),0);
	}
	
	
}
