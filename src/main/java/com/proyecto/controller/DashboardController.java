package com.proyecto.controller;

import com.proyecto.domain.Dashboard;
import com.proyecto.service.DashboardService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/panel")
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/dashboard")
    public String mostrarDashboard(Model model) {
        log.info("Mostrando el Dashboard");
        
        // Obtener ventas por día, mes y año
        List<Dashboard> ventasPorDia = dashboardService.obtenerVentasPorDia();
        List<Dashboard> ventasPorMes = dashboardService.obtenerVentasPorMes();
        List<Dashboard> ventasPorAnio = dashboardService.obtenerVentasPorAnio();
        
        log.info("Ventas por Día: " + ventasPorDia.size());
        log.info("Ventas por Mes: " + ventasPorMes.size());
        log.info("Ventas por Año: " + ventasPorAnio.size());
        
        model.addAttribute("ventasPorDia", ventasPorDia);
        model.addAttribute("ventasPorMes", ventasPorMes);
        model.addAttribute("ventasPorAnio", ventasPorAnio);
        
        return "panel/dashboard";
    }
    
    @GetMapping("/seguridad")
    public String mostrarPanelSeguridad(Model model) {
        return "panel/seguridad";
    }
    
    @GetMapping("/contenido")
    public String mostrarPanelContenido(Model model) {
        return "panel/contenido";
    }
    
}

