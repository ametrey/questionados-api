package ar.com.ada.api.questionados.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.ada.api.questionados.entities.Respuesta;

public interface RespuestaRepository extends JpaRepository<Respuesta, Integer>{
    
}
