package ar.com.ada.api.questionados.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.questionados.entities.Categoria;
import ar.com.ada.api.questionados.repositories.CategoriaRepository;


@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository repo;


    public List<Categoria> traerCategorias() {
        return repo.findAll();
    }

    public void crearCategoria(Categoria categoria){
        repo.save(categoria);
    }

    

    

   
    
}
