package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {
	
	// variables
	
	String nombre = "Unknown";
	String modeloCoche = "";
	String matricula = "0000000";
	double valoracionMedia = 0d;
	boolean ocupado = false;
	ArrayList<Conductor> valoraciones = new  ArrayList<>();
	
	// constructor
	
	public Conductor(String nombre) {
		this.nombre = nombre;
		
	}
	
	// getters
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getModelo() {
		return this.modeloCoche;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public double getValoracion() {
		return this.valoracionMedia;
	}
	
	public boolean isOcupado() {
		return ocupado;
	}
	
	
	// setters
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setModelo(String modeloCoche) {
		this.modeloCoche = modeloCoche;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setValoracion(double valoracionMedia) {
		this.valoracionMedia = valoracionMedia;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	// logic
	
	public void setValoracion (Conductor valoracion) {
		
		valoraciones.add(valoracion);
	}
	
	public void setValoracionMedia(Conductor valoracion) {
		double valoracionTotal = 0;
		for (Conductor valor : valoraciones) {
			valoracionTotal = valoracionTotal + valor.getValoracion();
		}
		valoracionMedia = valoracionTotal / valoraciones.size();
	}

}

