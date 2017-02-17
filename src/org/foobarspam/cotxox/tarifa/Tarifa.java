package org.foobarspam.cotxox.tarifa;

import org.foobarspam.cotxox.carrera.*;

public class Tarifa {
	
	// variables

	final double costeMilla = 1.35;
	final double costeMinuto = 0.35;
	final int costeMinimo = 5;
	final int porcentajeComision = 20;
	
	// constructor
	
	public Tarifa() {
	}
	
	// getters
	
	public double getCosteMilla() {
		return costeMilla;
	}

	public double getCosteMinuto() {
		return costeMinuto;
	}

	public int getCosteMinimo() {
		return costeMinimo;
	}
	
	// logic
	
	public double getCosteDistancia(double distancia) {
		
		double costePorDistancia = distancia * getCosteMilla();
		return costePorDistancia;
		
	}
	
	public double getCosteTiempo (int minutos) {
		
		double costePorTiempo = minutos * getCosteMinuto();
		return costePorTiempo;
	}
	
	public double getTotalEsperado(Carrera carrera) {
		
		double totalEsperado = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
		
		if (totalEsperado >= 5) {
			return totalEsperado;
		} else {
			return getCosteMinimo();
		}			
	}
	
}
