package ar.com.ada.api.questionados.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.questionados.entities.Categoria;
import ar.com.ada.api.questionados.models.response.GenericResponse;
import ar.com.ada.api.questionados.services.CategoriaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class CategoriaController{

    @Autowired
    private CategoriaService service;

    @GetMapping("/categorias")
    public ResponseEntity<List<Categoria>> traerCategorias() {
        return ResponseEntity.ok(service.traerCategorias());
    }

    @GetMapping("/categorias/{id}")
    public ResponseEntity<Categoria> traerCategoriaPorId(@PathVariable Integer id){
        return ResponseEntity.ok(service.buscarCategoria(id));
    }

    @PostMapping(value="/categorias")
    public ResponseEntity<?> crearCategoria(@RequestBody Categoria categoria) {
                
        GenericResponse respuesta = new GenericResponse();

        if(service.crearCategoria(categoria)){
        
            respuesta.isOk = true;
            respuesta.id = categoria.getCategoriaId();
            respuesta.message = "La categoría fue creada con éxito";

        return ResponseEntity.ok(respuesta);
        } else {
            respuesta.isOk = false;
            respuesta.message = "Error. Esta categoría ya existe";
            return ResponseEntity.badRequest().body(respuesta);
        }

    }

    /*@PutMapping (value = "/categorias/{id}")
    public ResponseEntity<Categoria> modificarCategoriaPOrId(@PathVariable Integer id){
        
        GenericResponse respuesta = new GenericResponse();
        
        Categoria categoria = service.buscarCategoria(id);

        categoria.setNombre(nombre);
        
    }*/
    
    
}