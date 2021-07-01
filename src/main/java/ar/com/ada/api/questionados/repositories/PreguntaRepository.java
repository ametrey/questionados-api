package ar.com.ada.api.questionados.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import ar.com.ada.api.questionados.entities.Pregunta;

public interface PreguntaRepository extends JpaRepository<Pregunta, Integer> {
    
}
