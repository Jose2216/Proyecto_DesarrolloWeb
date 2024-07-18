
package Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyecto.service.DashboardService;


@RestController
@RequestMapping("/api")
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/ventas-por-anio")
    public List<VentaPorAnioDTO> getVentasPorAnio() {
        return dashboardService.obtenerVentasPorAnio();
    }
}

