
package com.proyecto.service;


import java.util.List;
import com.proyecto.domain.Dashboard;


public interface DashboardService {
    
    List<Dashboard> obtenerVentasPorDia();
    List<Dashboard> obtenerVentasPorMes();
    List<Dashboard> obtenerVentasPorAnio();
}