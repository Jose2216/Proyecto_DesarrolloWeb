package com.proyecto.service;

import com.proyecto.domain.Categoria;
import com.proyecto.domain.PopularSeries;
import com.proyecto.domain.Producto;
import java.util.List;

public interface ProductoService {

    //Se obtiene un listado de productos en un List
    public List<Producto> getProductos(boolean activos);

    public Producto getProducto(Producto producto);

    public void save(Producto producto);

    public void delete(Producto producto);

}
