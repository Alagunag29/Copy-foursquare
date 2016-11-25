package io.github.alaguna.foursquare.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Alaguna on 23/11/2016.
 */

public class Sitio implements Serializable{
    private String nombre;
    private String especialidad;
    private int valoracion;
    private String descripcion;
    private Calificacion calificacion;
    private String telefono;
    private Ubicacion ubicacion;
    private String propietario;
    private String estado;
    private ArrayList<Tips> tips;
    private String foto;


    public Sitio(String nombre, String especialidad, int valoracion, String descripcion, Calificacion calificacion,
                 String telefono, Ubicacion ubicacion, String  propietario, String estado, String foto){
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.valoracion = valoracion;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.propietario = propietario;
        this.estado = estado;
        this.foto =  foto;
        tips = new ArrayList<Tips>();

    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getValoracion() {
        return valoracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getEstado() {
        return estado;
    }

    public ArrayList<Tips> getTips() {
        return tips;
    }

    public String getFoto() {
        return foto;
    }
}
