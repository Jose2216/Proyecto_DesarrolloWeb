
package com.proyecto.service.impl;

import com.proyecto.dao.DashboardDao;
import com.proyecto.domain.Dashboard;
import com.proyecto.service.DashboardService;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    private DashboardDao dashboardDao;

    @Override
    @Transactional(readOnly = true)
    public List<Dashboard> obtenerVentasPorDia() {
        LocalDate hoy = LocalDate.now();
        return dashboardDao.obtenerVentasPorDia(hoy);

    }

    @Override
    @Transactional(readOnly = true)
    public List<Dashboard> obtenerVentasPorMes() {
        LocalDate hoy = LocalDate.now();
        return dashboardDao.obtenerVentasPorMes(hoy);

    }
    @Override
    public List<Dashboard> obtenerVentasPorAnio() {
        return dashboardDao.obtenerVentasPorAnio(LocalDate.now());
    }
}


