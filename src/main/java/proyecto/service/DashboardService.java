/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.dao.DashboardDao;
import proyecto.domain.Dashboard;

@Service
public class DashboardService {
    
    @Autowired
    private DashboardDao ventaRepository;

    public List<Dashboard> obtenerVentasPorAnio() {
        return ventaRepository.obtenerVentasPorAnio();
    }
}