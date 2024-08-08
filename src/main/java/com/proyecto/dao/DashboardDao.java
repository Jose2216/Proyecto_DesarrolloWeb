package com.proyecto.dao;

import com.proyecto.domain.Dashboard;
import java.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface DashboardDao extends JpaRepository<Dashboard, Long> {

    @Query("SELECT d FROM Dashboard d WHERE d.fechaVenta = :fecha")
    List<Dashboard> obtenerVentasPorDia(@Param("fecha") LocalDate fecha);

    @Query("SELECT d FROM Dashboard d WHERE MONTH(d.fechaVenta) = MONTH(:fecha) AND YEAR(d.fechaVenta) = YEAR(:fecha)")
    List<Dashboard> obtenerVentasPorMes(@Param("fecha") LocalDate fecha);

    @Query("SELECT d FROM Dashboard d WHERE YEAR(d.fechaVenta) = YEAR(:fecha)")
    List<Dashboard> obtenerVentasPorAnio(@Param("fecha") LocalDate fecha);
}



