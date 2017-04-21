package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by vgarcia.regadera on 19/04/2017.
 */
public class PoolConductores {

    ArrayList<Conductor> conductores = new ArrayList<>();

    //constructor

    public PoolConductores(ArrayList<Conductor> conductores) {

        this.conductores = conductores;

    }

    // logic
    public Conductor asignarConductor() {

        int pilotoNumero = ThreadLocalRandom.current().nextInt(0, this.conductores.size());
        Conductor pilotoAsignado = null;

        while (pilotoAsignado == null) {

            if (this.conductores.get(pilotoNumero).isOcupado() == true) {
                pilotoAsignado = this.conductores.get(pilotoNumero);
                pilotoAsignado.ocupar();

            } else {
                pilotoNumero = ThreadLocalRandom.current().nextInt(0, this.conductores.size());
            }
        }
        return pilotoAsignado;
    }
}

