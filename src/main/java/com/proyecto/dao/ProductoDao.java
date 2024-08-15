package com.proyecto.dao;

import com.proyecto.domain.Producto;
import com.proyecto.domain.Categoria;
import com.proyecto.domain.PopularSeries;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoDao extends JpaRepository<Producto, Long> {

    List<Producto> findByCategoria(Categoria categoria);

    List<Producto> findByPSerie(PopularSeries pSerie);
}
