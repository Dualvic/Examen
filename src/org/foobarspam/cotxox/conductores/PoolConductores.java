package org.foobarspam.cotxox.conductores;

import org.foobarspam.cotxox.carrera.*;
import java.util.ArrayList;

public class PoolConductores {

	// variables
	
	ArrayList<Conductor> conductores = new ArrayList<>();
	
	// constructor
	
	public PoolConductores(ArrayList<Conductor> poolConductores) {
		
		this.conductores = poolConductores;
	
	}

	// logic
	
	public void asignarConductor(){
		for (Conductor conductor : conductores) {
			if (conductor.isOcupado() == false) {
				conductor.setOcupado(true);
				Carrera carrera = new Carrera();
				carrera.setConductor(conductor);
			}
		}
	}
}
