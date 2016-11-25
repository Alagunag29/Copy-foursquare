package io.github.alaguna.foursquare.model;

import java.io.Serializable;

/**
 * Created by Alaguna on 23/11/2016.
 */

public class Ubicacion  implements Serializable {
    private double latitud;
    private double longitud;
    private String direccion;
    private String ciudad;

    public Ubicacion(double latitud, double longitud, String direccion, String ciudad){
        this.latitud = latitud;
        this.longitud = longitud;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
}
