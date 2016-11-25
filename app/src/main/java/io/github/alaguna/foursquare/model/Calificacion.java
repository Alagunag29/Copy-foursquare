package io.github.alaguna.foursquare.model;

import java.io.Serializable;

/**
 * Created by Alaguna on 23/11/2016.
 */

public class Calificacion implements Serializable {
    private double puntaje;
    private int total;

    public Calificacion(double puntaje, int total){
        this.puntaje = puntaje;
        this.total = total;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public int getTotal() {
        return total;
    }
}
