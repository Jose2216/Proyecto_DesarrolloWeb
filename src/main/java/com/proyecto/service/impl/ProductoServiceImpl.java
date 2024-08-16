package com.proyecto.service.impl;

import com.proyecto.dao.CategoriaDao;
import com.proyecto.dao.PSeriesDao;
import com.proyecto.dao.ProductoDao;
import com.proyecto.domain.Categoria;
import com.proyecto.domain.PopularSeries;
import com.proyecto.domain.Producto;
import com.proyecto.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> getProductos() {
        return productoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }

    @Transactional(readOnly = true)
    public List<Producto> findByCategoria(Categoria categoria) {
        return productoDao.findByCategoria(categoria);
    }

//    @Override
//    @Transactional(readOnly = true)
//    public List<Producto> findByPSerie(PopularSeries pSerie) {
//        return productoDao.findByPSerie(pSerie);
//    }

    @Override
    public List<Producto> findByPSerie(PopularSeries pSerie) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
