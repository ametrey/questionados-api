package ar.com.ada.api.questionados.entities;

import java.util.*;

public class Categoria {
    
    private Integer categoriaId;
    private String nombre;
    private String descripcion;
    private List<Categoria> categorias = new ArrayList<>();
    private List<Pregunta> preguntas = new ArrayList<>();
    
    public Integer getCategoriaId() {
        return categoriaId;
    }
    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public List<Categoria> getCategorias() {
        return categorias;
    }
    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
    
}
