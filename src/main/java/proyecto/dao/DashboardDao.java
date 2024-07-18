/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyecto.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import proyecto.domain.Dashboard;

public interface DashboardDao extends JpaRepository<Venta, Long> {

    @Query("SELECT new com.example.dto.VentaPorAnioDTO(YEAR(v.fecha), SUM(v.monto)) " +
           "FROM Venta v GROUP BY YEAR(v.fecha)")
    List<Dashboard> obtenerVentasPorAnio();
}

