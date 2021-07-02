package ar.com.ada.api.questionados.entities;

import java.util.*;
import javax.persistence.*;

public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer preguntaId;
    
    private String enunciado;

    @OneToMany(mappedBy = "pregunta", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Respuesta> respuestas;

    @ManyToOne
    @JoinColumn(name = "categoria_id", referencedColumnName = "categoria_id")
    private Categoria categoria;

    
    public Integer getPreguntaId() {
        return preguntaId;
    }
    
    public void setPreguntaId(Integer preguntaId) {
        this.preguntaId = preguntaId;
    }
    
    public String getEnunciado() {
        return enunciado;
    }
    
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    
    public List<Respuesta> getRespuestas() {
        return respuestas;
    }
    
    public void setRespuestas(List<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }
    
    public Categoria getCategoria() {
            return categoria;
    }
    
    public void setCategoria(Categoria categoria) {
            this.categoria = categoria;
    }

    
    
    
    
}
