package ar.com.ada.api.questionados.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import ar.com.ada.api.questionados.entities.Categoria;
import ar.com.ada.api.questionados.services.CategoriaService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CategoriaController{

    private CategoriaService service;

    @GetMapping("/categorias")
    public ResponseEntity<List<Categoria>> traerCategorias() {
        return ResponseEntity.ok(service.traerCategorias());
    }
    
}