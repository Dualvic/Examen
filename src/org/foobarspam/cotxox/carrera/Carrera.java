package org.foobarspam.cotxox.carrera;

import org.foobarspam.cotxox.conductores.*;
import org.foobarspam.cotxox.tarifa.Tarifa;

/**
 * Created by vgarcia.regadera on 19/04/2017.
 */
public class Carrera {


    private String tarjetaCredito = "";
    private String origen = "";
    private String destino = "";
    private double distancia = 0;
    private double tiempoEsperado = 0;
    private double tiempoCarrera = 0;
    private double costeTotal = 0;
    private double propina = 0;
    private Conductor conductor = null;


    // constructor

    public Carrera (String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    // getters

    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    public String getOrigen() {
        return this.origen;
    }

    public String getDestino() {
        return this.destino;
    }

    public double getDistancia() {
        return this.distancia;
    }


    public Conductor getConductor() {
        return this.conductor;
    }

    public double getPropina() {
        return this.propina;
    }

    public double getCosteTotal() {
        return this.costeTotal;
    }

    // setters

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setTiempoEsperado(double tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }


    // logic

    public double getCosteEsperado() {
        return Tarifa.getCosteTotalEsperado(distancia, tiempoEsperado);
    }

    public void realizarPago(double total) {

        this.costeTotal = total;
    }

    public void recibirPropina(double propina) {
        this.propina = propina;
    }

    public void asignarConductor(PoolConductores pool){
        this.setConductor(pool.asignarConductor());

    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
}
