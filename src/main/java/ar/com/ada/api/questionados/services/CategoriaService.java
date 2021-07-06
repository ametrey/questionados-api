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

    public boolean crearCategoria(Categoria categoria){
        if(existe(categoria.getNombre()))
            return false;

        repo.save(categoria);

        return true;
    }

    private boolean existe(String nombre) {
        Categoria categoria = repo.findByNombre(nombre);
        return categoria != null;
    }

    public Categoria buscarCategoria(Integer categoriaId){
        
        Optional<Categoria> resultado = repo.findById(categoriaId);
        Categoria categoria = null;

        if(resultado.isPresent())
            categoria = resultado.get();

        return categoria;
    }

    

    

    

   
    
}
