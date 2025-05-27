package com.gestor.recetas.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Recetas")
public class Receta {

    @Id
    private String id;

    private String nombre;  //el nombre simplemente ingresa por un input que haya en el front ya que no hay login.
    private List<String> ingredientes;
    private List<String> pasos;
    private String autor;  // Alias del usuario, opcional
    private List<String> favoritosDe;  // Lista de alias de usuarios que marcaron como favorito
    private List<Comentario> comentarios;
    private String fechaCreacion;

    // Getters y Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<String> getPasos() {
        return pasos;
    }

    public void setPasos(List<String> pasos) {
        this.pasos = pasos;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public List<String> getFavoritosDe() {
        return favoritosDe;
    }

    public void setFavoritosDe(List<String> favoritosDe) {
        this.favoritosDe = favoritosDe;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
