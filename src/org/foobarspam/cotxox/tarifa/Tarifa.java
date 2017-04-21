package org.foobarspam.cotxox.tarifa;

import org.foobarspam.cotxox.carrera.Carrera;

/**
 * Created by vgarcia.regadera on 19/04/2017.
 */
public class Tarifa {

    private static double costeMilla = 1.35;
    private static double costeMinuto = 0.35;
    private static double costeMinimo = 5.0;
    private double porcentajeComision = 20;

    // getters

    public static double getCosteMilla() {
        return costeMilla;
    }

    public static double getCosteMinuto() {
        return costeMinuto;
    }

    public static double getCosteMinimo() {
        return costeMinimo;
    }


    // logic

    public static double getCosteDistancia(double distancia) {
        double costeFinalDistancia = getCosteMilla() * distancia;
        return costeFinalDistancia;
    }

    public static double getCosteTiempo(double minutos) {
        double costeFinalTiempo = getCosteMinuto() * minutos;
        return costeFinalTiempo;
    }

    public static double getCosteTotalEsperado(double tiempo, double distancia) {

        double costeFinal = getCosteDistancia(distancia) + getCosteTiempo(tiempo);
        if (costeFinal < getCosteMinimo()) {
            return getCosteMinimo();
        } else {
            return costeFinal;
        }
    }


}
