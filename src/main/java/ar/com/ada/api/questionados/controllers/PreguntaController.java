package ar.com.ada.api.questionados.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import ar.com.ada.api.questionados.entities.Pregunta;
import ar.com.ada.api.questionados.services.PreguntaService;

@RestController
public class PreguntaController {

    @Autowired
    private PreguntaService service;

    @GetMapping("/preguntas"{
        public ResponseEntity<List<Pregunta>> traerPreguntas(){

            return ResponseEntity.ok(service.traerPreguntas());
            
        }
    }

}
