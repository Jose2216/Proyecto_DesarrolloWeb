package com.proyecto.service;

import com.proyecto.domain.Categoria;
import java.util.List;

public interface CategoriaService {

    public List<Categoria> getCategorias();

    public Categoria getCategoria(Categoria categoria);

    public void save(Categoria categoria);

    public void delete(Categoria categoria);
}
