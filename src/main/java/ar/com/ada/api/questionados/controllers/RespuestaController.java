package ar.com.ada.api.questionados.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.questionados.services.RespuestaService;

@RestController
public class RespuestaController {

    @Autowired
    private RespuestaService service;

    
}
