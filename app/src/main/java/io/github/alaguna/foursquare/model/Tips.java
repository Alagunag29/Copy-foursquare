package io.github.alaguna.foursquare.model;

import java.io.Serializable;

/**
 * Created by Alaguna on 23/11/2016.
 */

public class Tips implements Serializable{
    private String autor;
    private String fecha;
    private int visitas;
    private String comentario;
    private int like;
    private int dislike;
    private String foto;

    public Tips(String autor, String fecha, int visitas, String comentario, int like, int dislike, String foto){
        this.autor = autor;
        this.fecha = fecha;
        this.visitas = visitas;
        this.comentario = comentario;
        this.like = like;
        this.dislike = dislike;
        this.foto = foto;
    }

    public String getAutor() {
        return autor;
    }

    public String getFecha() {
        return fecha;
    }

    public int getVisitas() {
        return visitas;
    }

    public String getComentario() {
        return comentario;
    }

    public int getLike() {
        return like;
    }

    public int getDislike() {
        return dislike;
    }

    public String getFoto() {
        return foto;
    }
}
