package com.proyecto.service;

import com.proyecto.domain.Categoria;
import com.proyecto.domain.PopularSeries;
import com.proyecto.domain.Producto;
import java.util.List;

public interface ProductoService {
     public List<Producto> getProductos();

    public Producto getProducto(Producto producto);

    public void save(Producto producto);

    public void delete(Producto producto);
      
    public List<Producto> findByCategoria(Categoria categoria);
    
    public List<Producto> findByPSerie(PopularSeries pSerie);
    
}
