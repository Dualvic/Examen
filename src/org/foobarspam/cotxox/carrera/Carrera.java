package org.foobarspam.cotxox.carrera;


import org.foobarspam.cotxox.conductores.Conductor;
import org.foobarspam.cotxox.conductores.PoolConductores;
import org.foobarspam.cotxox.tarifa.Tarifa;

public class Carrera {

	//variables
	
	private String tarjetaCredito = "000000000";
	private String origen = "Unkown";
	private String destino = "Magaluf";
	int tiempoEsperadoMinutos = 0;
	private double distancia = 0;
	private double costeTotal = 0;
	private double propina = 0;
	Conductor conductor = new Conductor("Samantha"); // This variable was null, but i put this to get the code working //

	//constructor
	
		public Carrera(){
			
		}
	
		public Carrera(String tarjetaCredito) {
			this.tarjetaCredito = tarjetaCredito;
		}
	
	
	//getters
	
		public String getTarjetaCredito() {
			return this.tarjetaCredito;
		}

		public String getOrigen() {
			return origen;
		}

		public String getDestino() {
			return destino;
		}

		public int getTiempoEsperado() {
			return tiempoEsperadoMinutos;
		}
		
		public double getDistancia() {
			return distancia;
		}
		
		public double getPropina() {
			return propina;
		}
		
		public Conductor getConductor() {
			return conductor;
		}

	//setters

	public void setTarjetaCredito(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public void setTiempoEsperado(int tiempoEsperado) {
		this.tiempoEsperadoMinutos = tiempoEsperado;
	}
	
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public void setPropina(double propina) {
		this.propina = propina;
	}
	
	public void setConductor(Conductor conductor){
		this.conductor = conductor;
	}
	
	public void setCosteTotal(double costeTotal){
		this.costeTotal = costeTotal;
	}
	
	//logic
	
	public double getCosteEsperado() {
		
		Tarifa tarifa = new Tarifa();
		Carrera carrera = new Carrera(getTarjetaCredito());
		
		double resultado = tarifa.getTotalEsperado(carrera);
		
		return resultado;
	}
	
	public void asignarConductor(PoolConductores conductores) {
		
		conductores.asignarConductor();
	}


	public void realizarPago(double costeEsperado) {	
		costeTotal = costeEsperado;
	}


	public void recibirPropina(int propina) {
		setPropina(1);
	}


	public double getCosteTotal() {
		setCosteTotal(getPropina() + getCosteEsperado());
		return costeTotal;
	}
	
}
