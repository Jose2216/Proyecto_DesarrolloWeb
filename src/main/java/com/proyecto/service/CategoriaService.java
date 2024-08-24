package com.proyecto.service;

import com.proyecto.domain.Categoria;
import java.util.List;

public interface CategoriaService {

    //Se obtiene un listado de categorias en un List
    public List<Categoria> getCategorias(boolean activos);

    public Categoria getCategoria(Categoria categoria);

    public void save(Categoria categoria);

    public void delete(Categoria categoria);
}
