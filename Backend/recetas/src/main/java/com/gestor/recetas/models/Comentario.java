package com.gestor.recetas.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Comentario")
public class Comentario {

    private String usuario;  // Alias del usuario que comenta
    private String texto;
    private String fecha;    // ISO Date como String

    // Getters y Setters

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
