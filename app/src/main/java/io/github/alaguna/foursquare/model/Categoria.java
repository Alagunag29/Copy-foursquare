package io.github.alaguna.foursquare.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Alaguna on 23/11/2016.
 */

public class Categoria implements Serializable{
    private String nombre;
    private ArrayList<Sitio> sitios;

    public Categoria(String nombre){
        this.nombre = nombre;
        sitios = new  ArrayList<Sitio>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Sitio> getSitios() {
        return sitios;
    }
}
