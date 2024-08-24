package com.proyecto.service.impl;


import com.proyecto.dao.PopularSeriesDao;
import com.proyecto.domain.PopularSeries;
import com.proyecto.service.PopularSeriesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PopularSeriesServiceImpl implements PopularSeriesService{
    
    @Autowired
    private PopularSeriesDao popularSeriesDao; //

    @Override
    @Transactional(readOnly = true)
    public List<PopularSeries> getPopularSeries(boolean activos) {
        var lista = popularSeriesDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true) 
    public PopularSeries getPopularSerie(PopularSeries popularseries) {
        return popularSeriesDao.findById(popularseries.getIdPSerie()).orElse(null);
    }

    @Override
    @Transactional 
    public void save(PopularSeries popularseries) {
        popularSeriesDao.save(popularseries);
    }

    @Override
    @Transactional
    public void delete(PopularSeries popularseries) {
        popularSeriesDao.delete(popularseries);
    }
}
