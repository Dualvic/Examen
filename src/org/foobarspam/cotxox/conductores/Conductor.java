package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;

/**
 * Created by vgarcia.regadera on 19/04/2017.
 */
public class Conductor {

    private static String nombre = "";
    private static String modelo = "";
    private static String matricula = "";
    private double valoracion= 0.0;
    private static ArrayList<Integer> valoraciones = new ArrayList();
    private boolean ocupado = false;

    // constructor

    public Conductor(String nombre) {
        this.nombre = nombre;
    }


    // getters

    public static String getNombre() {
        return nombre;
    }

    public static String getModelo() { return modelo;}

    public static String getMatricula() { return matricula;}

    public static ArrayList<Integer> getValoracion() {return valoraciones;}

    public ArrayList<Integer> getValoraciones() {
        return valoraciones;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    // setters

    public void ocupar() {
        this.ocupado = true;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setValoracion(int valoracion) {
        valoraciones.add(valoracion);
        this.actualizarMedia();
    }

    public void setValoracionMedia(double media) {
        this.valoracion = media;
    }
    
    //logic

    public void actualizarMedia() {

        double suma = 0.0;

        for (Integer valoracion : this.getValoraciones()) {
            suma += valoracion;
        }

        double media = suma / this.getValoraciones().size();
        this.setValoracionMedia(media);
    }
}
